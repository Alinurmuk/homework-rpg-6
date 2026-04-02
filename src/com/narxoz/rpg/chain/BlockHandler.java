package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;
public class BlockHandler extends DefenseHandler {
    private double p;
    public BlockHandler(double p) { this.p = p; }
    @Override
    public void handle(int d, ArenaFighter t) {
        int b = (int)(d * p);
        System.out.println("[Блок] -" + b);
        passToNext(d - b, t);
    }
}