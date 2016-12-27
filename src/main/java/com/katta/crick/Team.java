package com.katta.crick;

import com.katta.crick.dto.Player;

import java.util.List;

public class Team {
    private final List<Player> players;
    private final String teamName;
    private Integer runs=0;
    private Integer wickets=0;
    private Integer balls =0;
    private Integer extras=0;

    public Integer getExtras() {
        return extras;
    }

    public void addExtras(Integer extra) {
        this.extras += extra;
    }

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addRuns(Integer run) {
        runs = runs + run;
    }

    public void addWickets() {
        wickets++ ;
    }

    public void addBalls() {
        ++balls;
    }

    public Integer getRuns() {
        return runs;
    }

    public Integer getWickets() {
        return wickets;
    }

    public Integer getBalls() {
        return balls;
    }
}
