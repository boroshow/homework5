package com.company;

    public class Hero {
        int health;
        int allAttack;
        int typeSuperAttack;
        Boss boss;

        public Hero(){

        }


        public Hero(int health, int allAttack, int typeSuperAttack) {
            this.health = health;
            this.allAttack = allAttack;
            this.typeSuperAttack = typeSuperAttack;
        }

    }