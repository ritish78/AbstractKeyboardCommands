package com.company;

public class Main {

    public static void main(String[] args) {
	//Subnautica rob = new Subnautica();              //Here, Subnautica can also be used. Instead we have chosen the other one.
	GamingConsole rob = new Subnautica();
	//GamingConsole rob = new Bioshock();             // Same case as above. This was done to understand how we can change between the sides of the super classes.
	rob.up();
	rob.down();
	rob.left();
	rob.right();
    }
}
