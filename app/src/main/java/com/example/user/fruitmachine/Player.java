package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public class Player {

    private int money;
    private FruitMachine fruitMachine;

    public Player (int money, FruitMachine fruitMachine) {
        this.money = money;
        this.fruitMachine = fruitMachine;
    }

    public int getMoney() {
        return this.money;
    }

    public void payMoney(int amount) {
        this.money -= amount;
        fruitMachine.receiveMoney(amount);
    }
}
