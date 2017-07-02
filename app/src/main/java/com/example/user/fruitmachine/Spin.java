package com.example.user.fruitmachine;

import behaviours.Fruit;
import java.util.Random;
import java.util.ArrayList;

/**
 * Created by user on 01/07/2017.
 */

public class Spin {

    ArrayList<Fruit> threeRolls;
    int spinValue;

    public Spin(ArrayList<Fruit> threeRolls) {
        this.threeRolls = threeRolls;
        this.spinValue = 0;
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
            threeRolls.add(roll);
        }

        return threeRolls;
    }

    public int calculateSpinValue() {

        int sum = 0;

        for (Fruit roll : threeRolls) {
            sum += roll.getValue();
        }

        if (threeRolls.get(0).equals(threeRolls.get(1))
                && threeRolls.get(1).equals(threeRolls.get(2))) {
            return sum;
            } else {
            return 0;
        }
    }


}
