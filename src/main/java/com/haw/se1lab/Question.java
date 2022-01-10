package com.haw.se1lab;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
    @Id
    @GeneratedValue
    private Long id;

    private String theme;
    private String questionBody;
    private String answer;

    public Question(String theme, String questionBody, String answer) {
        this.theme = theme;
        this.questionBody = questionBody;
        this.answer = answer;
    }

    protected Question() {
    }

    public String getTheme() {
        return theme;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public String getAnswer() {
        return answer;
    }

    public Long getId() {
        return id;
    }
}
