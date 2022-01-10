package com.haw.se1lab;

import com.haw.se1lab.Video;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class LearningCorner {
    @Id
    @GeneratedValue
    private Long id;

    private String theme;
    private String article;
    @ManyToOne
    private Video film;
//    private Question question;

    public LearningCorner() {
    }

    public LearningCorner(String theme, String article, Video film) {
        this.theme = theme;
        this.article = article;
        this.film = film;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Video getFilm() {
        return film;
    }

    public void setVideo(Video film) {
        this.film = film;
    }

/*
    public Question createQuestion(String questionID, String theme, String questionBody, String answer) {
        this.question = question;
        return new Question( theme, questionBody, answer);
    }
*/

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}