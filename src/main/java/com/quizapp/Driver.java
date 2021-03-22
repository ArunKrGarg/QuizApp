package com.quizapp;

import com.quizapp.model.Question;
import com.quizapp.model.QuestionType;
import com.quizapp.model.Quiz;
import com.quizapp.model.User;
import com.quizapp.persistance.QuizList;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Question question = new Question("1+2=", QuestionType.SUBJECTIVE, null, "3");
        question.setNext(new Question("2*4=", QuestionType.MCQ, Arrays.asList("2", "5", "8", "None"), "8"));
        quiz.setStart(question);

        User user = new User();
        user.startsQuiz(quiz);
    }
}
