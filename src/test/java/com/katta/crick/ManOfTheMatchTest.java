package com.katta.crick;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManOfTheMatchTest extends TestData {


        @Test
        public void testNoManOfTheMatch() throws  Exception{
                ManOfTheMatch manOfTheMatch = new ManOfTheMatch();
                assertNull(manOfTheMatch.getManOfTheMatch());
        }

//        @Test
//        public void startMatchStart(){
//                Team teamKolkata =  new Team(kolkataPlayers);
//                Team teamPune =  new Team(punePlayers);
//                Match match = new Match(teamKolkata, teamPune);
//                assertTrue(match.start());
//        }


        @Test
        public void startScoring(){
                Match match = new Match(teamKolkata, teamPune);
                BALLS.forEach(bowl -> match.bowled(bowl));
                assertEquals(20,teamKolkata.getRuns().intValue());
                assertEquals(2, teamPune.getExtras().intValue());
                assertEquals(10, teamPune.getBalls().intValue());
        }

        @Test
        public  void testGetManOfMatch(){
                assertEquals(20,teamKolkata.getRuns().intValue());
                assertEquals(2, teamPune.getExtras().intValue());
                assertEquals(10, teamPune.getBalls().intValue());
        }

}