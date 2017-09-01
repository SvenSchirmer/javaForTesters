package com.javafortesters.chap003myfirsttest.functions;

public class myCalculator {

    static boolean val1BiggerThenVal2 = false;

    public int addValues(int val1, int val2) {

        if (val1 > val2) {
            val1BiggerThenVal2 = true;
        }

        return val1 + val2;
    }
}
