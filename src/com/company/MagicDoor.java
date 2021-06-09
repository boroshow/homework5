package com.company;

public class MagicDoor {

    public Hero[] heroes = new Hero[4];

    public Hero[] getPlayers(){
        heroes[0] = new Hero(200,20,1);
        heroes[1] = new Hero(200,20,1);
        heroes[2] = new Hero(200,20,1);
        heroes[3] = new Hero(200,20,1);
        return heroes;
    }
}
