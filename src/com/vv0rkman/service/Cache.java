package com.vv0rkman.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {

    private Map<Long, Entry> cache;

    private long millisUntilExpiration;

    private static final int MAX_ENTRIES = 5_000;

    public Cache(){

        this(10_000);

    }

    public Cache(long millisUntilExpiration) {

        this.millisUntilExpiration = millisUntilExpiration;

        cache = new LinkedHashMap<Long, Entry>() {

            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > MAX_ENTRIES;
            }

        };

    }

    static private class Entry {
        private long timestamp;
        private Object object;

        Entry(long timestamp, Object object) {
            this.timestamp = timestamp;
            this.object = object;
        }

        long getTimestamp() {
            return timestamp;
        }

        void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        Object getObject() {
            return object;
        }

        void addObject(Object object) {
            this.object = object;
        }
    }

    synchronized public void put(long id, Object object) {

        Entry entry = entryFor(id);

        if (entry != null) {

            entry.setTimestamp(System.currentTimeMillis());
            entry.addObject(object);

        } else {

            cache.put(id, new Entry(System.currentTimeMillis(), object));

        }

    }

    synchronized void clear() {

        cache.clear();

    }

    synchronized public Object get(long id) {

        Entry entry = entryFor(id);

        if (entry != null) {

            return entry.getObject();

        }

        return null;

    }

    private Entry entryFor(long id) {

        Entry entry = cache.get(id);

        if (entry != null) {

            long delta = System.currentTimeMillis() - entry.getTimestamp();

            if (delta < 0 || delta >= millisUntilExpiration) {

                cache.remove(id);
                entry = null;

            }
        }
        return entry;
    }

}
