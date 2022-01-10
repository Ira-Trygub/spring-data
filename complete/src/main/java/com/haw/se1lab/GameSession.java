package com.haw.se1lab;

import com.haw.se1lab.GameStatus;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Component
@Entity
public class GameSession {
    private int points;
    private final List<User> rival;
    private int timer;
    private boolean winner;
    private GameStatus status;
    @Id
    @GeneratedValue
    private Long id;

    public GameSession(int points, List<User> rival, int timer, boolean winner, GameStatus status) {
        this.points = points;
        this.rival = rival;
        this.timer = timer;
        this.winner = winner;
        this.status = status;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<User> getRival() {
        return rival;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
