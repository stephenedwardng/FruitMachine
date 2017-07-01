package com.example.user.fruitmachine;

import behaviours.Fruit;
import java.util.Random;
import java.util.ArrayList;

/**
 * Created by user on 01/07/2017.
 */

public class Spin {

    ArrayList<Fruit> threeRolls;

    public Spin(ArrayList<Fruit> threeRolls) {
        this.threeRolls = threeRolls;
    }

    public Fruit spin() {
        Fruit[] fruits = Fruit.values();
        Random random = new Random();
        int index = random.nextInt(fruits.length);
        Fruit fruit = fruits[index];
        return fruit;
    }

    public ArrayList<Fruit> collectThreeRolls() {

        for(int count = 0; count < 3; count++) {
            Fruit roll = spin();
            this.threeRolls.add(roll);
        }

        return this.threeRolls;
    }

}
