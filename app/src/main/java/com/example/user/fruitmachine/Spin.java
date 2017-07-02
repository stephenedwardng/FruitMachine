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

//    public int calculateSpinValue() {
//
//        Fruit[] fruits = Fruit.values();
//        for (Fruit fruit : fruits) {
//            if (threeRolls.get(0).equals(fruit)
//                    && threeRolls.get(1).equals(fruit)
//                    && threeRolls.get(2).equals(fruit)) {
//                return fruit.getValue();
//            }
//        }
//
//        return 0;
//    }

    public int calculateSpinValue() {

        ArrayList<Fruit> currentSpin = collectThreeRolls();
        int value = 0;

        value += currentSpin.get(0).getValue();
        value += currentSpin.get(1).getValue();
        value += currentSpin.get(2).getValue();

//            for (int count = 0; count <= 2; count++) {
//                spinValue += threeRolls.get(count).getValue();
//            }

//        if (spinValue == 15 |
//                spinValue == 60 |
//                spinValue == 180 |
//                spinValue == 600) {
//            return spinValue;
//        } else {
//            return 0;
//        }


        if (currentSpin.get(0).getFruitType().equals(currentSpin.get(1).getFruitType())
                && currentSpin.get(1).getFruitType().equals(currentSpin.get(2).getFruitType())) {
            return value;
        } else return -1;

    }

}
