package com.quizapp.persistance;

import com.quizapp.model.Quiz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class QuizList {
    public static Set<Quiz> quizzes = new LinkedHashSet<Quiz>();

    public static List<Quiz> getList(int pageNo, int pageSize){
        List<Quiz>quizzes = new ArrayList<Quiz>(QuizList.quizzes);
        List<Quiz>output = new ArrayList<Quiz>();
        for(int i=pageNo*pageSize; i<(pageNo+1)*pageSize; i++){
            output.add(quizzes.get(i));
        }
        return output;
    }
}
