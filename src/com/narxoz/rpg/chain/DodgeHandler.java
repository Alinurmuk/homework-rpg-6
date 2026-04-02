package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;
import java.util.Random;
public class DodgeHandler extends DefenseHandler {
    private double chance; private Random r = new Random();
    public DodgeHandler(double c) { this.chance = c; }
    @Override
    public void handle(int d, ArenaFighter t) {
        if(r.nextDouble() < chance) System.out.println("[Жалтару] Соққы тимеді!");
        else passToNext(d, t);
    }
}