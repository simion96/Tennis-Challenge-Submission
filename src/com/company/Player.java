package com.company;

public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void scorePoint() {
        this.score++;
    }
}
