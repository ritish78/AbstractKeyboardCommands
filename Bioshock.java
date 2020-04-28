package com.company;

public class Bioshock implements GamingConsole {


    @Override
    public void up() {
        System.out.println("Moves 1 step up");

    }

    @Override
    public void down() {
        System.out.println("Moves 1 step down");

    }

    @Override
    public void left() {
        System.out.println("Moves 1 step left");

    }

    @Override
    public void right() {
        System.out.println("Moves 1 step right");

    }
}
