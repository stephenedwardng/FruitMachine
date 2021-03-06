package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import behaviours.Fruit;

import static behaviours.Fruit.BAR;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class SpinTest {

    Spin spin;

//    @Before
//    public void before() {
//        ArrayList<Fruit> threeRolls = new ArrayList<>();
//        spin = new Spin(threeRolls);
//    }

//    @Test
//    public void canSpin() {
//        assertEquals("7", spin.spin().getFruitType());
//    }

//    @Test
//    public void canCollectThreeRolls() {
//        assertEquals("[BAR, JACKPOT, CHERRIES]", spin.collectThreeRolls());
//    }

    // Mockito not installed. Manual tests passing successfully
    @Test
    public void canCalculateSpinValue() {
        ArrayList<Fruit> threeRolls = new ArrayList<>();
        spin = new Spin(threeRolls);
        System.out.println(spin.collectThreeRolls());
        assertEquals(6, spin.calculateSpinValue());
    }

}
