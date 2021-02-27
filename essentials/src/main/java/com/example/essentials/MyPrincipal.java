package com.example.essentials;


import java.util.ArrayList;
import java.util.List;

public class MyPrincipal {
    public static void main(String[] args) {
        Integer test;
        Test2 test2 = new Test2(null);
        String valor2 = "dsds";


        System.out.println("valor de variable: " + test2.prop1.toString());
        valor2 = test2.prop1;
        System.out.println("valor 2: " + valor2);

        char letter = 65;
        //String dsds

        List<String> ds = new ArrayList<>();


    }

    public static class Test2 {
        String prop1;

        public Test2(String prop1) {
            this.prop1 = prop1;
        }
    }
}
