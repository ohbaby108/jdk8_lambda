package com.local.lambda.userdefinedfunctionalinterface_demo;

import com.local.lambda.userdefinedfunctionalinterface.Teacher;



public class TestMain {
    public static void main(String[] args) {
        //方式一 :
       StudentDao dao=new StudentDao() {
           @Override
           public int get(Student student) {
               return 1;
           }
       };
        System.out.println(dao.get(new Student()));

        //方式二 :
        StudentDao dao1=(student -> {return 2;});
        System.out.println(dao1.get(new Student()));

        //方式三 :

        StudentDao dao2=(Student student)->{return 3;};
        System.out.println(dao2.get(new Student()));

        //方式四 :
        StudentDao dao3=(student)->4;
        System.out.println(dao3.get(new Student()));

        //方式五 :
        StudentDao dao4=(Student student)->5;
        System.out.println(dao4.get(new Student()));





    }
}
