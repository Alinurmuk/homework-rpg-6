package com.narxoz.rpg.command;
import com.narxoz.rpg.arena.ArenaFighter;
public class HealCommand implements ActionCommand {
    private ArenaFighter t; private int a, r;
    public HealCommand(ArenaFighter t, int a) { this.t = t; this.a = a; }
    @Override
    public void execute() { int old = t.getHealth(); t.heal(a); r = t.getHealth() - old; }
    @Override
    public void undo() { t.takeDamage(r); }
    @Override
    public String getDescription() { return "Емделу (+" + a + ")"; }
}