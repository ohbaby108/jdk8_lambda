package com.local.lambda;

public class Code1 {
    public static void main(String[] args) {
        //匿名内部内方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run.....");
            }
        }).start();

        //Lambda方式
        new Thread(()->{
            System.out.println("run.....");
        }).start();


    }
}
