package com.quizapp.model;


import com.quizapp.persistance.QuizList;
import com.quizapp.persistance.ResponseList;
import com.quizapp.service.QuizService;
import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Data
public class Quiz implements QuizService {
    private static int sequence;
    private int id;
    private Question start;
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Quiz(){
        id = sequence++;
    }

    public void start(User user) {
        Question curr = start;
        while (curr!=null){
            String ans = curr.load();
            curr.submit(ans);
            curr = curr.getNext();
        }
        submit(user);
    }

    public void submit(User user) {
        // popup()
        System.out.println("Submitting Quiz.");
        ResponseList.responses.add(new QuizResponse(user,this));
    }

    public List<Quiz> getQuiz(int pageNo, int pageSize) {
        return QuizList.getList(pageNo,pageSize);
    }
}
