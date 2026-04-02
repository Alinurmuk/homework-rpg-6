package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;
import java.util.Random;

public class CriticalHitHandler extends DefenseHandler {
    private final Random random = new Random();
    @Override
    public void handle(int incomingDamage, ArenaFighter target) {
        if (random.nextDouble() < 0.15) { // 15% мүмкіндік
            System.out.println("!!! КРИТИКАЛЫҚ СОҚҚЫ !!! Зақым екі еселенді!");
            passToNext(incomingDamage * 2, target);
        } else {
            passToNext(incomingDamage, target);
        }
    }
}