package com.narxoz.rpg.command;

import com.narxoz.rpg.arena.ArenaFighter;

public class DefendCommand implements ActionCommand {
    private final ArenaFighter target;
    private final double dodgeBoost;
    private boolean executed = false;

    public DefendCommand(ArenaFighter target, double dodgeBoost) {
        this.target = target;
        this.dodgeBoost = dodgeBoost;
    }

    @Override
    public void execute() {
        target.modifyDodgeChance(dodgeBoost);
        executed = true;
        System.out.println("[Command] Қорғаныс қосылды: +" + (dodgeBoost * 100) + "% жалтару мүмкіндігі.");
    }

    @Override
    public void undo() {
        if (executed) {
            target.modifyDodgeChance(-dodgeBoost);
            executed = false;
            System.out.println("[Undo] Қорғаныс бонусы алынып тасталды.");
        }
    }

    @Override
    public String getDescription() {
        return "Қорғаныс (Бонус: +" + (dodgeBoost * 100) + "% Dodge)";
    }
}