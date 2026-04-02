package com.narxoz.rpg.arena;

public class ArenaEvent {
    public static String getRandomEvent(ArenaFighter hero) {
        double rand = Math.random();
        if (rand < 0.2) {
            hero.modifyDodgeChance(-0.1);
            return "Аренада балшық! Жалтару қиындады (-10%)";
        } else if (rand > 0.8) {
            return "Көрермендер қолдап жатыр! Рухың көтерілді!";
        }
        return "Аренада тыныштық...";
    }
}