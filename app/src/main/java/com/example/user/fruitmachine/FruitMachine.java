package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public class FruitMachine {

    private int money;

    public FruitMachine(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void receiveMoney(int amountToAdd) {
        money += amountToAdd;
    }
}
