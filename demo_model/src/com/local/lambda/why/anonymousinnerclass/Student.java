package com.local.lambda.why.anonymousinnerclass;
/**
 * 传统方法
 * */
public class Student {
    private String name;
    private int age;
    private Float score;

    public Student() {
    }

    public Student(String name, int age, Float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
