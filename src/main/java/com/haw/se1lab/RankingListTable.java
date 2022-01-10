package com.haw.se1lab;

import java.util.HashMap;

public class RankingListTable {
    private final HashMap<UserID, Integer> userRanking;

    public RankingListTable(HashMap<UserID, Integer> userRanking) {
        this.userRanking = userRanking;
    }

//    public HashMap<UserID, Integer> getUserRanking() {
//        return userRanking;
//    }
//
//    public void setUserRanking(HashMap<UserID, Integer> userRanking) {
//        this.userRanking = userRanking;
//    }
}
