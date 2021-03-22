package com.quizapp.model;

import com.quizapp.service.QuestionService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Getter
@Setter
public class Question implements QuestionService {
    private String id;
    private String problemStatement;
    private QuestionType type;
    private List<String> options;
    private Question prev;
    private Question next;
    private String response;
    private String correctResponse;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Question(String problemStatement, QuestionType type, List<String> options, String correctResponse){
        this.problemStatement = problemStatement;
        this.type = type;
        this.options = options;
        this.correctResponse = correctResponse;
    }

    public String load(){
        System.out.println("Question: " + problemStatement);
        String ans = null;
        if(type == QuestionType.SUBJECTIVE){
            try {
                ans = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Options: ");
            for(String option: options){
                System.out.println(option);
            }
            System.out.println("Select Option: ");
            try {
                ans = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ans;
    }

    public void submit(String ans) {
        // pop()
        this.response = ans;
    }


}
