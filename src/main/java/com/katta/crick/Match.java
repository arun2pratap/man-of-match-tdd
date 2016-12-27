package com.katta.crick;

import com.katta.crick.dto.*;

public class Match {
    private final Team team1;
    private final Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void bowled(Ball bowl) {
        Player striker = bowl.getStriker();
        Player bowler = bowl.getBowler();
        Player assistant = bowl.getAssistant();
        Player dismissed = bowl.getDismissed();

        Team battingTeam = bowl.getBattingTeam();
        Team bowlingTeam = bowl.getBowlingTeam();

        striker.addRuns(bowl.getRuns());
        striker.addNowOfBowlsPlayed();

        bowler.addRuns(bowl.getRuns());
        if(!bowl.getWicketType().equals(WicketType.NONE)){
            Wicket wicket = new Wicket(bowl.getBowler(),bowl.getWicketType(),bowl.getDismissed(),bowl.getAssistant());
            bowler.addWicket(wicket);
        }
        bowler.addExtras(bowl.getExtra());
        if(assistant != null) {
            assistant.addAssist(1);
        }
        if(dismissed != null){
            dismissed.setStatus(PlayerStatus.OUT);
        }

        battingTeam.addRuns(bowl.getRuns());
        battingTeam.addRuns(bowl.getExtra());

        if(bowl.getExtraType().equals(ExtraType.NONE)){
            bowlingTeam.addBalls();
        }
        bowlingTeam.addExtras(bowl.getExtra());

    }

}
