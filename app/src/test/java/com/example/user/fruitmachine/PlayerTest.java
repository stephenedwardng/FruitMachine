package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class PlayerTest {

    Player player;
    FruitMachine fruitMachine;

    @Before
    public void before() {
        player = new Player(20, fruitMachine);
    }

    @Test
    public void canGetMoney() {
        assertEquals(20, player.getMoney());
    }

    @Test
    public void canPayMoney() {
        player.payMoney(1);
        assertEquals(19, player.getMoney());
        //assertEquals(1, fruitMachine.payoutValue());
    }

    @Test
    public void canPullLever() {
        // game.spin();
    }
}
