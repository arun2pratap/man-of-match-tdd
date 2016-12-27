package com.katta.crick.dto;

public class Wicket {
    WicketType type;
    Player dismissed ;
    Player bowler;
    Player assistant;

    public Wicket(Player bowler, WicketType type, Player dismissed, Player assistant) {

        this.bowler = bowler;
        this.type = type;
        this.dismissed = dismissed;
        this.assistant = assistant;
    }

    public WicketType getType() {
        return type;
    }
}
