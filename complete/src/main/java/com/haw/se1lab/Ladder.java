package com.haw.se1lab;



import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity
public class Ladder {
    private User leader;
    private RankingListTable rankinglist;
    @Id
    @GeneratedValue
    private Long id;

    public Ladder(RankingListTable rankinglist, User leader) {
        this.rankinglist = rankinglist;
        this.leader = leader;
    }

    public RankingListTable getRankinglist() {
        return rankinglist;
    }

    public void setRankinglist(RankingListTable rankinglist) {
        this.rankinglist = rankinglist;
    }

    public User getLeader() {
        return leader;
    }

    public void setLeader(User leader) {
        this.leader = leader;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
