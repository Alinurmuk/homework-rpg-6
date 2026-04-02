package com.narxoz.rpg.chain;
import com.narxoz.rpg.arena.ArenaFighter;
public abstract class DefenseHandler {
    protected DefenseHandler next;
    public DefenseHandler setNext(DefenseHandler n) { this.next = n; return n; }
    protected void passToNext(int d, ArenaFighter t) { if(next != null && d > 0) next.handle(d, t); }
    public abstract void handle(int d, ArenaFighter t);
}