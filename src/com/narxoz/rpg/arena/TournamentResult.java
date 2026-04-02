package com.narxoz.rpg.arena;
import java.util.*;
public class TournamentResult {
    private String winner;
    private int rounds;
    private final List<String> log = new ArrayList<>();
    public void setWinner(String w) { winner = w; }
    public void setRounds(int r) { rounds = r; }
    public void addLine(String l) { log.add(l); }
    public String getWinner() { return winner; }
    public int getRounds() { return rounds; }
    public List<String> getLog() { return log; }
}