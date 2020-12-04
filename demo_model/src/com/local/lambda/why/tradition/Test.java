package com.local.lambda.why.tradition;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 15, 99.0f));
        list.add(new Student("张三", 16, 89.0f));
        list.add(new Student("张三", 13, 69.0f));
        list.add(new Student("张三", 18, 59.0f));
        list.add(new Student("张三", 17, 29.0f));
        //查找年龄大于16岁的学生
        findByAge(list);
        System.out.println("=============================");

        //查询成绩
        findByScore(list);
    }
    public static void findByAge(ArrayList<Student> students){
        ArrayList<Student> list=new ArrayList<>();
        for(Student stu:students){
           if (stu.getAge()>15){
               list.add(stu);
           }
        }
        for(Student stu:list){
            System.out.println(stu);
        }
    }

    public static void findByScore(ArrayList<Student> students){
        ArrayList<Student> list=new ArrayList();
        for(Student student:students){
            if (student.getScore()>60){
                list.add(student);
            }
        }
        for(Student stu:list){
            System.out.println(stu);
        }
    }
}

