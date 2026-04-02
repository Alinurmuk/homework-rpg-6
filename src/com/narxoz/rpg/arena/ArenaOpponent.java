package com.narxoz.rpg.arena;
public class ArenaOpponent {
    private String name;
    private int health, maxHealth, attackPower;
    public ArenaOpponent(String n, int h, int p) { name = n; health = h; maxHealth = h; attackPower = p; }
    public void takeDamage(int a) { health = Math.max(0, health - a); }
    public void restoreHealth(int a) { health = Math.min(maxHealth, health + a); }
    public boolean isAlive() { return health > 0; }
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }
}