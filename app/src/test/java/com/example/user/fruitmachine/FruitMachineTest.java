package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class FruitMachineTest {

    FruitMachine fruitMachine;
    Player player;

    @Before
    public void FruitMachine() {
        fruitMachine = new FruitMachine(1);
        player = new Player(10, fruitMachine);
    }

    @Test
    public void canGetMoney() {
        assertEquals(1, fruitMachine.getMoney());
    }

    @Test
    public void canReceiveMoney() {
        player.payMoney(2);
        assertEquals(3, fruitMachine.getMoney());
    }
}
