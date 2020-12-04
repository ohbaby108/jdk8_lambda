package com.local.lambda.why.strategy;

import com.local.lambda.why.tradition.Student;

public class ScoreFilter implements StudentFilter{
    @Override
    public boolean compare(Student student) {
        return student.getScore()>60;
    }
}
