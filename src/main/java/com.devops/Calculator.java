package com.devops;

import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add 6+4="+add(6,4));
        System.out.println("6 - 3 = " + subtract(6,3));
    }
    public static int add(int a,int b){
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

}
