package com.example.user.fruitmachine;

import java.util.Scanner;

/**
 * Created by user on 02/07/2017.
 */

public class CommandLineInterface {

    Spin spin;

    public CommandLineInterface(Spin spin) {
        this.spin = spin;
    }

    public void promptPullLever() {
        System.out.println("Press 'p' to pull lever");
    }

    public char action() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        return input.charAt(0);
    }

    public void displaySpinResult() {
        System.out.println("You spun: " + spin.threeRolls);
    }

    public void threeMatch() {
        System.out.println("Three matches worth £" + spin.calculateSpinValue());
    }

    public void pullOrCashOut() {
        System.out.println("Press 'c' to Cash Out or 'k' to Keep playing");
    }

    public void cashOut() {
        System.out.println("You have cashed out with £" + spin.calculateSpinValue());
    }

    public void promptMoney() {
        System.out.println("Please insert coins (as an integer): ");
    }

    public int moneyAction() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }

    public void promptHold() {
        System.out.println("Do you want to hold? y / n ");
    }

    public void promptAskRoll(int count) {
        System.out.println("Do you want to re-spin roller " + spin.threeRolls.get(count) + "? y / n ");
    }

    public char actionReSpin() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        return input.charAt(0);
    }

}
