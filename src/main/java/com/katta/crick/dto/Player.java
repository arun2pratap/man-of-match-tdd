package com.katta.crick.dto;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String playerName;
    final Integer WICKET_POINT = 25;
    Integer basePoint =0;
    Integer nowOfBowlsBowled=0;
    Integer nowOfBowlsPlayed=0;
    Integer runs=0;
    Integer assist=0;
    Integer bonusPoint=0;
    Integer extras=0;
    List<Wicket> wickets = new ArrayList<>();

    public PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(PlayerStatus status) {
        this.status = status;
    }

    private PlayerStatus status = PlayerStatus.NOTOUT;

    public void addExtras(Integer extra) {
        this.extras += extra;
    }

    public void addWicket(Wicket wicket) {
        wickets.add(wicket);
        basePoint += WICKET_POINT;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void addBasePoint(Integer basePoint) {
        this.basePoint += basePoint;
    }

    public void addNowOfBowlsBowled(Integer nowOfBowlsBowled) {
        this.nowOfBowlsBowled += nowOfBowlsBowled;
    }

    public void addNowOfBowlsPlayed() {
        ++this.nowOfBowlsPlayed;
    }

    public void addRuns(Integer runs) {
        this.runs += runs;
        this.basePoint += runs;
    }

    public void addAssist(Integer assist) {
        this.assist += assist;
    }

    public Integer getBasePoint() {
        return basePoint;
    }

    public Integer getNowOfBowlsBowled() {
        return nowOfBowlsBowled;
    }

    public Integer getNowOfBowlsPlayed() {
        return nowOfBowlsPlayed;
    }

    public Integer getRuns() {
        return runs;
    }

    public Integer getAssist() {
        return assist;
    }

    public Integer getBonusPoint() {
        return bonusPoint;
    }

    public Integer getExtras() {
        return extras;
    }

    public List<Wicket> getWickets() {
        return wickets;
    }
}
