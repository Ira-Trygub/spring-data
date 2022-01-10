package com.haw.se1lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Game {
    private String theme;
    private int gamersAmount;
    @OneToMany(fetch = FetchType.EAGER)
    private Question question;
    @Id
    @GeneratedValue
    private Long id;

    public Game(String theme, int gamersAmount, Question question) {
        this.theme = theme;
        this.gamersAmount = gamersAmount;
        this.question = question;
    }

    public Game() {
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getGamersAmount() {
        return gamersAmount;
    }

    public void setGamersAmount(int gamersAmount) {
        this.gamersAmount = gamersAmount;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
