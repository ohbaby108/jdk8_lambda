package com.local.lambda.why.strategy;

import com.local.lambda.why.tradition.Student;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 15, 99.0f));
        list.add(new Student("张三", 16, 89.0f));
        list.add(new Student("张三", 13, 69.0f));
        list.add(new Student("张三", 18, 59.0f));
        list.add(new Student("张三", 17, 29.0f));

        findByAge(list,new AgeFilter());
        System.out.println("===========================");
        findByScore(list,new ScoreFilter());
    }
    public static void findByAge(ArrayList<Student> students,StudentFilter filter){
        ArrayList<Student> list=new ArrayList<>();
        for(Student stu:students){
            Boolean result=  filter.compare(stu);
             if (result){
                 list.add(stu);
             }
        }
       printStudent(list);
    }

    public static void findByScore(ArrayList<Student> students,StudentFilter filter){
        ArrayList<Student> list=new ArrayList<>();

        for(Student stu:students){
            if (filter.compare(stu)){
                list.add(stu);
            }
        }
        printStudent(list);
    }

    private static void printStudent(ArrayList<Student> students){
        for(Student stu:students){
            System.out.println(stu);
        }
    }
}
