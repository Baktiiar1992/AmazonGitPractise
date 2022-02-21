package com.digital_nomads.javaFall2021.exceptions;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        int a [ ] = new int[4];
        System.out.println(Demo1.test(a));


//        try {
//            FileWriter myWriter = new FileWriter("filename.txt");
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }finally {
//            System.out.println("finally ");
//        }


    } public static boolean test (int[] a)throws Exception{
        int b [] = new int[a.length];
        return a !=b;
    }
}
