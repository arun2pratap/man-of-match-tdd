package com.katta.crick.dto;

import com.katta.crick.Team;

public class Ball {
    private Integer inningNumber;
    private Double ballNumber ;
    private  Team battingTeam ;
    private  Team bowlingTeam ;
    private  Player striker;
    private  Player nonStriker;
    private  Player bowler;
    private  Integer runs;
    private  Integer extra;
    private ExtraType extraType ;
    private WicketType wicketType;
    private  Player dismissed;
    private  Player assistant;

    public Ball(Integer inningNumber, Double ballNumber, Team battingTeam, Team bowlingTeam, Player striker, Player nonStriker, Player bowler,
                Integer runs, Integer extra, ExtraType extraType, WicketType wicketType, Player dismissed, Player assistant) {
        this.inningNumber = inningNumber;
        this.ballNumber = ballNumber;
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.striker = striker;
        this.nonStriker = nonStriker;
        this.bowler = bowler;
        this.runs = runs;
        this.extra = extra;
        this.extraType = extraType;
        this.wicketType = wicketType;
        this.dismissed = dismissed;
        this.assistant = assistant;
    }

    public Integer getInningNumber() {
        return inningNumber;
    }

    public Double getBallNumber() {
        return ballNumber;
    }

    public Team getBattingTeam() {
        return battingTeam;
    }

    public Team getBowlingTeam() {
        return bowlingTeam;
    }

    public Player getStriker() {
        return striker;
    }

    public Player getNonStriker() {
        return nonStriker;
    }

    public Player getBowler() {
        return bowler;
    }

    public Integer getRuns() {
        return runs;
    }

    public Integer getExtra() {
        return extra;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public Player getDismissed() {
        return dismissed;
    }

    public Player getAssistant() {
        return assistant;
    }

    public ExtraType getExtraType() {
        return extraType;
    }
}
