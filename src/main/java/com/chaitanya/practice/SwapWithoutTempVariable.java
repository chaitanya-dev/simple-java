package com.chaitanya.practice;

/**
 * Created by Chaitanya on 30-05-2017.
 */
public class SwapWithoutTempVariable {

    public static void main(String[] args) {
        int a = 55, b = 999;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
