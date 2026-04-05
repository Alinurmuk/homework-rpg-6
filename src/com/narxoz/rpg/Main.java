package com.narxoz.rpg;
import com.narxoz.rpg.arena.*;
import com.narxoz.rpg.tournament.TournamentEngine;

public class Main {
    public static void main(String[] args) {
        ArenaFighter h = new ArenaFighter("Алпамыс", 150, 0.2, 25, 10, 30, 3);
        ArenaOpponent o = new ArenaOpponent("Айдаһар", 200, 25);
        TournamentResult r = new TournamentEngine(h, o).runTournament();
        System.out.println("Жеңімпаз: " + r.getWinner() + " (" + r.getRounds() + " раунд)");
        for(String s : r.getLog()) System.out.println(s);
    }
}