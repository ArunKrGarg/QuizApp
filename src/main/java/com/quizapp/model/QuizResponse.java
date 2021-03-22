package com.quizapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class QuizResponse {
    private User user;
    private Quiz quiz;
    //Map<String, String>
}
