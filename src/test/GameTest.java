package test;

import com.company.Game;
import com.company.Player;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GameTest {

    @Test
    public void jimWinsConvincingly() {
        Player jim = new Player("Jim");
        Player roger = new Player("Roger");
        Game game = new Game(jim, roger);

        game.markScore(jim);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(jim);

        Assert.assertEquals(game.getScore(), "Game Jim");
    }

    @Test
    public void jimWinsFromDeuce() {

        Player jim = new Player("Jim");
        Player roger = new Player("Roger");
        Game game = new Game(jim, roger);

        game.markScore(jim);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(jim);

        Assert.assertEquals(game.getScore(), "Game Jim");
    }

    @Test
    public void jimWinsHardMatch() {
        Player jim = new Player("Jim");
        Player roger = new Player("Roger");
        Game game = new Game(jim, roger);

        game.markScore(jim);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(jim);

        Assert.assertEquals(game.getScore(), "Game Jim");
    }

    @Test
    public void rogerWinsBalancedMatch() {
        Player jim = new Player("Jim");
        Player roger = new Player("Roger");
        Game game = new Game(jim, roger);

        game.markScore(jim);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(roger);
        game.markScore(jim);
        game.markScore(jim);
        game.markScore(roger);
        game.markScore(roger);
        game.markScore(roger);

        Assert.assertEquals(game.getScore(), "Game Roger");
    }
}