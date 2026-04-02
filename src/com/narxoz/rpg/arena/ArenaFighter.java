package com.narxoz.rpg.arena;
public class ArenaFighter {
    private final String name;
    private int health, maxHealth, healPotions, armorValue, blockRating, attackPower;
    private double dodgeChance;

    public ArenaFighter(String name, int health, double dodge, int block, int armor, int atk, int pots) {
        this.name = name; this.health = health; this.maxHealth = health;
        this.dodgeChance = dodge; this.blockRating = block;
        this.armorValue = armor; this.attackPower = atk; this.healPotions = pots;
    }
    public void takeDamage(int amt) { health = Math.max(0, health - amt); }
    public void heal(int amt) { if(healPotions > 0) { health = Math.min(maxHealth, health + amt); healPotions--; } }
    public void modifyDodgeChance(double d) { dodgeChance = Math.max(0, Math.min(1, dodgeChance + d)); }
    public boolean isAlive() { return health > 0; }
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public double getDodgeChance() { return dodgeChance; }
    public int getBlockRating() { return blockRating; }
    public int getArmorValue() { return armorValue; }
    public int getAttackPower() { return attackPower; }
    public int getHealPotions() { return healPotions; }
}