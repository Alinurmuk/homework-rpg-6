package com.narxoz.rpg.command;
import com.narxoz.rpg.arena.ArenaOpponent;
public class AttackCommand implements ActionCommand {
    private ArenaOpponent t; private int p, d;
    public AttackCommand(ArenaOpponent t, int p) { this.t = t; this.p = p; }
    @Override
    public void execute() { int old = t.getHealth(); t.takeDamage(p); d = old - t.getHealth(); }
    @Override
    public void undo() { t.restoreHealth(d); }
    @Override
    public String getDescription() { return "Шабуыл (" + p + ")"; }
}