package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;
public class HpHandler extends DefenseHandler {
    @Override
    public void handle(int d, ArenaFighter t) {
        t.takeDamage(d);
        System.out.println("[HP] Тиген зақым: " + d);
    }
}