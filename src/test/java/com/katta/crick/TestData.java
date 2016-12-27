package com.katta.crick;

import com.katta.crick.dto.Ball;
import com.katta.crick.dto.ExtraType;
import com.katta.crick.dto.Player;
import com.katta.crick.dto.WicketType;

import java.util.Arrays;
import java.util.List;

public class TestData {

    Player MCCULLAM = new Player("MCCULLAM");
    Player GANGUALLY = new Player("GANGUALLY");
    Player KHAN = new Player("KHAN");
    Player KUMAR = new Player("KUMAR");

    List<Player> kolkataPlayers = Arrays.asList(MCCULLAM,
            GANGUALLY,
            new Player("KolkataP3"),
            new Player("KolkataP4"),
            new Player("KolkataP5"),
            new Player("KolkataP6"),
            new Player("KolkataP7"),
            new Player("KolkataP8"),
            new Player("KolkataP9"),
            new Player("KolkataP10"),
            new Player("KolkataP11")
    );
    List<Player> punePlayers = Arrays.asList(KHAN,
            KUMAR,
            new Player("PuneP3"),
            new Player("PuneP4"),
            new Player("PuneP5"),
            new Player("PuneP6"),
            new Player("PuneP7"),
            new Player("PuneP8"),
            new Player("PuneP9"),
            new Player("PuneP10"),
            new Player("PuneP11")
    );
    //    String KOLKATA = "Kolkata";
//    String PUNE = "Pune";
    Team teamKolkata = new Team("KOLKATA", kolkataPlayers);
    Team teamPune = new Team("PUNE", punePlayers);

    List<Ball> BALLS = Arrays.asList(
            new Ball(1, 0.3, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KUMAR, 0, 1, ExtraType.WIDE, WicketType.NONE, null, null),
            new Ball(1, 0.4, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KUMAR, 0, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 0.5, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KUMAR, 0, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 0.6, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KUMAR, 0, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 0.7, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KUMAR, 0, 1,ExtraType.LBW, WicketType.NONE, null, null),
            new Ball(1, 1.1, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KUMAR, 0, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 1.2, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KHAN, 4, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 1.3, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KHAN, 4, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 1.4, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KHAN, 6, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 1.5, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KHAN, 4, 0,ExtraType.NONE, WicketType.NONE, null, null),
            new Ball(1, 1.6, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KHAN, 0, 0,ExtraType.NONE, WicketType.LBW, MCCULLAM, null),
            new Ball(1, 2.1, teamKolkata, teamPune, MCCULLAM, GANGUALLY, KHAN, 0, 0,ExtraType.NONE, WicketType.CAUGHT, GANGUALLY, KUMAR)
    );
}
