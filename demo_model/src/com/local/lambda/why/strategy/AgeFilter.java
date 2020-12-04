package com.local.lambda.why.strategy;

import com.local.lambda.why.tradition.Student;

public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>15;
    }

}
