package com.example.user.fruitmachine;

/**
 * Created by user on 02/07/2017.
 */

public interface UserInterface {

    void promptPullLever();

    char action();

    void displaySpinResult();

    void threeMatch();

    void pullOrCashOut();

    void cashOut();

    void promptMoney();

    int moneyAction();

    void promptHold();

    void promptAskRoll(int count);

    void promptNudge();

    void promptAskNudge(int count);

}
