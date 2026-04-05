package com.narxoz.rpg.tournament;
import com.narxoz.rpg.arena.*;
import com.narxoz.rpg.chain.*;
import com.narxoz.rpg.command.*;

public class TournamentEngine {
    private ArenaFighter hero; private ArenaOpponent opp;
    public TournamentEngine(ArenaFighter h, ArenaOpponent o) { hero = h; opp = o; }
    public TournamentResult runTournament() {
        TournamentResult res = new TournamentResult();
        ActionQueue q = new ActionQueue();
        DefenseHandler chain = new CriticalHitHandler(); // Критикалық соққы қосылды
        chain.setNext(new DodgeHandler(hero.getDodgeChance()))
             .setNext(new BlockHandler(hero.getBlockRating()/100.0))
             .setNext(new ArmorHandler(hero.getArmorValue()))
             .setNext(new HpHandler());

        int r = 0;
        while(hero.isAlive() && opp.isAlive() && r < 15) {
            r++;
            res.addLine(ArenaEvent.getRandomEvent(hero)); // Оқиға қосылды
            q.enqueue(new AttackCommand(opp, hero.getAttackPower()));
            if(hero.getHealth() < 40) q.enqueue(new UltimateAbilityCommand(hero, opp)); // Ультимейт
            q.executeAll();
            if(opp.isAlive()) chain.handle(opp.getAttackPower(), hero);
            res.addLine("Раунд " + r + " аяқталды.");
        }
        res.setWinner(hero.isAlive() ? hero.getName() : opp.getName());
        res.setRounds(r);
        return res;
    }
}