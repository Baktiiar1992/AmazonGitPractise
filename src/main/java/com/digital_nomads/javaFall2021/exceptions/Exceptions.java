package com.digital_nomads.javaFall2021.exceptions;

public class Exceptions {
    public static void main(String[] args) {




        try {
            int[] a = new int[3];
            System.out.println(a[5]);
        } catch(ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
            System.err.println("We have a bug");


        }
        System.out.println("Hello World");
    }
}
