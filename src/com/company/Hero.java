package com.company;

public class Hero {
    private int health;
    private int allAttack;
    private int typeSuperAttack;

    public Hero() {

    }


    public Hero(int health, int allAttack, int typeSuperAttack) {
        this.health = health;
        this.allAttack = allAttack;
        this.typeSuperAttack = typeSuperAttack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAllAttack() {
        return allAttack;
    }

    public void setAllAttack(int allAttack) {
        this.allAttack = allAttack;
    }

    public int getTypeSuperAttack() {
        return typeSuperAttack;
    }

    public void setTypeSuperAttack(int typeSuperAttack) {
        this.typeSuperAttack = typeSuperAttack;
    }
}