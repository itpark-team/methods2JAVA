package com.company;

public class Main2 {

    static void changeValue(String s) {
        s = "lpj";
        System.out.println("s changeValue in - " + s);
    }

    public static void main(String[] args) {
        String s = "abc";
        String s2 = new String("abc");

        System.out.println(s.equals(s2));

        /*System.out.println("s main before - " + s);
        changeValue(s);
        System.out.println("s main after - " + s);*/
    }
}
