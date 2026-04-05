package com.narxoz.rpg.command;
import java.util.*;
public class ActionQueue {
    private List<ActionCommand> q = new ArrayList<>();
    public void enqueue(ActionCommand c) { q.add(c); }
    public void undoLast() { if(!q.isEmpty()) q.remove(q.size()-1); }
    public void executeAll() { for(ActionCommand c : q) c.execute(); q.clear(); }
    public List<String> getDescriptions() { 
        List<String> d = new ArrayList<>(); 
        for(ActionCommand c : q) d.add(c.getDescription()); 
        return d; 
    }
}