package com.vv0rkman.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Random;

public class IDGenerator{
    public static BigInteger generateID(){
        Random randomNumber = new Random();
        BigInteger id = new BigInteger(LocalDate.now());
        return id;
    }
}