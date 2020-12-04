package com.local.lambda.systemprovided;

import java.util.function.Consumer;

//Consumer代表一个输入
public class Code_Consumer {
    public static void main(String[] args) {

        Consumer c1=new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        c1.accept("hello world_Consumer");


        //演示

        Runnable r1=()->{int i=get();
            System.out.println(i);
        };
        r1.run();

        Runnable r2=()->exec();;
        r2.run();

    }
        static int get(){
            return 1;
        }

        static String find(){
            return "find";
        }
        static void exec(){
            find();
        }


}
