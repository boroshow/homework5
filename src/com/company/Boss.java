package com.company;

public class Boss {

    int healthBoss;
    int allAttackBoos;
    int defenceType;

    public int getHealthBoss() {
        return healthBoss;
    }

    public void setHealthBoss(int healthBoss) {

        this.healthBoss = healthBoss;
    }

    public int getAllAttackBoos() {
        return allAttackBoos;
    }

    public void setAllAttackBoos(int allAttackBoos) {
        this.allAttackBoos = allAttackBoos;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }
    
    public void changeDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    public Boss(int healthBoss, int allAttackBoos, int defenceType) {
        this.healthBoss = healthBoss;
        this.allAttackBoos = allAttackBoos;
        this.defenceType = defenceType;




    }
}
