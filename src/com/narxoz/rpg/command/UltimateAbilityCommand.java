package com.narxoz.rpg.command;
import com.narxoz.rpg.arena.ArenaOpponent;
import com.narxoz.rpg.arena.ArenaFighter;

public class UltimateAbilityCommand implements ActionCommand {
    private final ArenaFighter hero;
    private final ArenaOpponent target;
    private int damageDealt;

    public UltimateAbilityCommand(ArenaFighter hero, ArenaOpponent target) {
        this.hero = hero;
        this.target = target;
    }

    @Override
    public void execute() {
        hero.takeDamage(10); // Өз денсаулығын жұмсайды
        int oldHp = target.getHealth();
        target.takeDamage(hero.getAttackPower() * 3); // 3 есе зақым
        damageDealt = oldHp - target.getHealth();
        System.out.println(">>> ULTIMATE ҚОЛДАНЫЛДЫ! <<<");
    }

    @Override
    public void undo() {
        target.restoreHealth(damageDealt);
        hero.heal(10); 
    }

    @Override
    public String getDescription() { return "Ақырғы соққы (Self-damage: 10, Hit: x3)"; }
}