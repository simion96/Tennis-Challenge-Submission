package com.company;

public class Game {
    Player p1;
    Player p2;
    public Game(Player player1, Player player2) {
        p1 = player1;
        p2 = player2;
    }

    public void markScore(Player player) {
       player.scorePoint();
       getScore();
    }

    private boolean isDeuce() {
        return p1.score >= 3 && p1.score == p2.score;
    }

    private boolean hasAdvantage() {
        if ((p1.score >= 4 && p1.score == p2.score + 1) || (p2.score >= 4 && p2.score == p1.score + 1)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean hasWinner() {
        if ((p1.score >= 4 && p1.score >= p2.score + 2) || (p2.score >= 4 && p2.score == p1.score + 2)) {
            return true;
        } else {
            return false;
        }
    }

    private String getLeader() {
        if (p1.score > p2.score) {
            return p1.name;
        } else {
            return p2.name;
        }
    }

    public String getScore() {
        String outputScore = null;
        if (hasWinner()) {
            outputScore = "Game " + getLeader();
        }

        if (hasAdvantage()) {
            if (p1.score > p2.score) {
                outputScore =  "A | 40";
            } else {
                outputScore = "40 | A";
            }
        }

        if (isDeuce()) {
            outputScore = "40 | 40";
        }

        //at this stage, the scores will either be 0, 15,30,40, or it will have entered one of the clauses above
        if (outputScore == null) {
            String res = mapScore(p1.score) + " | " + mapScore(p2.score);
            System.out.println(res);
            return res;
        } else {
            System.out.println(outputScore);
            return outputScore;
        }
    }

    private String mapScore(int score) {
        if (score == 0) {
            return "0";
        } else if (score == 1) {
            return "15";
        } else if (score == 2) {
            return "30";
        } else if (score == 3) {
            return "40";
        }
        throw new IllegalArgumentException("Invalid score, should not reach " + score);
    }
}
