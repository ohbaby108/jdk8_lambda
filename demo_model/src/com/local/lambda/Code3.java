package com.local.lambda;

import java.util.concurrent.Callable;

public class Code3 {
    public static void main(String[] args) {
       //方式一 :
        Callable<String> c1=new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello1";
            }
        };
        try {
            System.out.println(c1.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //方式二 :
        Callable<String> c2 =()->{return "hello2";};
        try {
            System.out.println(c2.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //方式三 :
        Callable c3=()->"hello3";
        try {
            System.out.println(c3.call());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
