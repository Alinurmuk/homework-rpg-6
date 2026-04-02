package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;
public class ArmorHandler extends DefenseHandler {
    private int v;
    public ArmorHandler(int v) { this.v = v; }
    @Override
    public void handle(int d, ArenaFighter t) {
        System.out.println("[Сауыт] -" + v);
        passToNext(Math.max(0, d - v), t);
    }
}