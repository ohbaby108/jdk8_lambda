package com.local.lambda.systemprovided;

import java.util.function.BiConsumer;

//BiConsumer代表两个输入
public class Code_BiConsumer {

    public static void main(String[] args) {

        BiConsumer<String,String> b1=new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+s2);
            }
        };
        b1.accept("hello world"," Biconsumber");
    }


}
