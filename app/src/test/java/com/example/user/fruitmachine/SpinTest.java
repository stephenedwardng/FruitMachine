package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class SpinTest {

    Spin spin;

    @Before
    public void before() {
        spin = new Spin();
    }

    @Test
    public void canSpin() {
        assertEquals("7", spin.spin().getFruitType());
    }


}
