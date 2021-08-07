package com.company;

public class Main {

    public static void main(String[] args) {

//	    Player player = new Player();
//	    player.fullName = "Volki";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Sevro", 100, "Rifle");
        System.out.println("Initial health is " + player.getHealth());
    }
}
