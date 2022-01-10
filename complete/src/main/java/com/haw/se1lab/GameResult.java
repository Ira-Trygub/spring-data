package com.haw.se1lab;

import java.util.List;

public class GameResult {
    private final int gameSessionId;
    private final List<User> players;
    private final GameStatus status;

    public GameResult(int gameSessionId, List<User> players, GameStatus status) {
        this.gameSessionId = gameSessionId;
        this.players = players;
        this.status = status;
    }
}
