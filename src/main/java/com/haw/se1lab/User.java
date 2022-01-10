package com.haw.se1lab;

import com.haw.se1lab.GIFLabel;
import com.haw.se1lab.GameResult;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Entity
public class User {

    //private final GIFLabel award;
    private String name;
    private String email;
    private int rank;
    private int points;
//    private List<GameResult> history;
    private HashMap<String, LocalDate> curriculum;
    //    @ManyToMany(fetch = FetchType.EAGER)
//    private List<User> friends;
    @Id
    @GeneratedValue
    private Long id;

    public User(String name, String email, int rank, int points, /* List<GameResult> history, GIFLabel award, */ HashMap<String, LocalDate> curriculum /* , List<User> friends*/) {
        this.name = name;

        this.email = email;
        this.rank = rank;
        this.points = points;
//        this.history = history;
        //this.award = award;
        this.curriculum = curriculum;
        //this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
//
//    public List<GameResult> getHistory() {
//        return history;
//    }
//
//    public void setHistory(List<GameResult> history) {
//        this.history = history;
//    }

//    public GIFLabel getAward() {
//        return award;
//    }

    public void setCurriculum(HashMap<String, LocalDate> curriculum) {
        this.curriculum = curriculum;
    }

//    public List<User> getFriends() {
//        return friends;

//
//
//    public void setFriends(List<User> friends) {
//        this.friends = friends;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
