package com.local.lambda.userdefinedfunctionalinterface;

public class TestMain {
    public static void main(String[] args) {
       //方式一 :
        TeacherDao dao=new TeacherDao() {
            @Override
            public void insert(Teacher teacher) {
                System.out.println("新增老师的方法一");
            }
        };
        dao.insert(new Teacher());

        //方式二 :
        TeacherDao dao1=(teacher -> System.out.println("新增老师的方法二"));
        dao1.insert(new Teacher());

        TeacherDao dao2=(Teacher teacher)-> System.out.println("新增老师的方法三");
        dao2.insert(new Teacher());

    }
}
