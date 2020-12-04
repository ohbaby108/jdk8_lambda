package com.local.lambda.why.lambda;



import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("alibaba", 15, 99.0f));
        list.add(new Student("tengxu", 16, 89.0f));
        list.add(new Student("didi", 13, 69.0f));
        list.add(new Student("zijietiaodong", 18, 59.0f));
        list.add(new Student("jingdong", 17, 29.0f));

        getByFilter(list,(e)->e.getAge()>16);
        System.out.println("==================================");
        getByFilter(list,(e)->e.getName().length()>5);
        System.out.println("==================================");
        getByFilter(list,(e)->e.getScore()>60);

    }
    public static void getByFilter(ArrayList<Student> students, StudentFilter filter){
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
