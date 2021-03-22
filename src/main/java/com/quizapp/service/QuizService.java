package com.quizapp.service;

import com.quizapp.model.Quiz;
import com.quizapp.model.User;

import java.util.List;

public interface QuizService {
    void start(User user);

    void submit(User user);

    List<Quiz> getQuiz(int pageNo, int pageSize);
}
