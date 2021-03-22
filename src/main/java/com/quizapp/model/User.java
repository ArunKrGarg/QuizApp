package com.quizapp.model;

import com.quizapp.persistance.QuizList;
import com.quizapp.service.UserService;

public class User implements UserService {
    private static int sequence;
    private int id;
    private String name;

    public User(){
        id = sequence++;
    }

    public void startsQuiz(Quiz quiz) {
        System.out.println("Quiz Starts");
        if(!QuizList.quizzes.contains(quiz)){
            QuizList.quizzes.add(quiz);
        }
        quiz.start(this);
    }
}
