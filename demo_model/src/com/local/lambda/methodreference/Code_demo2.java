package com.local.lambda.methodreference;

import java.util.function.Supplier;

public class Code_demo2 {
    static String put(){

        System.out.println("put......");

        return "put";
    }

    public static void main(String[] args) {

//        System.out.println(put());

        Supplier<String> s=new Supplier<String>() {
            @Override
            public String get() {
                return Code_demo2.put();
            }
        };
        System.out.println(s.get());

        Supplier<String> s2=Code_demo2::put;
        System.out.println(s2.get());
        Supplier<String> s3=Fun::ha;
        System.out.println(s3.get());
    }
    //抱住并增加财富才是致富关键
    //
   static class Fun{
        public static String ha(){
            return "haha";
        }
   }
}
