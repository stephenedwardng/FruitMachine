package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public class Player {

    private int money;

    public Player (int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public void payMoney(int amount) {
        money -= amount;
    }
}
