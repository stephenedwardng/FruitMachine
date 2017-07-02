package com.example.user.fruitmachine;

/**
 * Created by user on 02/07/2017.
 */

public class Game {

    private CommandLineInterface ui;
    private FruitMachine fruitMachine;
    private Player player;
    private Spin spin;

    public Game() {

        fruitMachine = new FruitMachine(100);
        player = new Player(100);
        spin = new Spin();
        ui = new CommandLineInterface(spin);

    }

    public void playGame() {

        char choice = 'p';
        gameLoop(choice);

        ui.cashOut();

    }

    private void gameLoop(char choice) {

            int money = 0;

            do {
                if (money == 0) {
                    ui.promptMoney();
                    money = ui.moneyAction();
                    player.payMoney(money);
                    fruitMachine.receiveMoney(money);
                }

                ui.promptPullLever();
                choice = ui.action();

                spin.collectThreeRolls();
                spin.calculateSpinValue();
                ui.displaySpinResult();

                if (spin.calculateSpinValue() != 0) {
                    ui.threeMatch();
                    ui.pullOrCashOut();
                    if (ui.action() == 'c') {
                        break;
                    }
                }

                ui.promptHold();
                char hold = ui.action();
                if (hold == 'y') {
                    for (int count = 0; count < 3; count++) {
                        ui.promptAskRoll(count);
                        if (ui.action() == 'y') {
                            spin.threeRolls.remove(count);
                            spin.threeRolls.add(count, spin.spin());
                        }
                    }
                    ui.displaySpinResult();
                    if (spin.calculateSpinValue() != 0) {
                        ui.threeMatch();
                        ui.pullOrCashOut();
                        if (ui.action() == 'c') {
                            break;
                        }
                    }
                }

                ui.promptNudge();
                char nudge = ui.action();
                if (nudge == 'y') {
                    for (int count = 0; count < 3; count++) {
                        ui.promptAskNudge(count);
                        if (ui.action() == 'y') {
                            spin.threeRolls.remove(count);
                            spin.threeRolls.add(count, spin.nudge(count));
                            break;
                        }
                    }
                    ui.displaySpinResult();
                    if (spin.calculateSpinValue() != 0) {
                        ui.threeMatch();
                        ui.pullOrCashOut();
                        if (ui.action() == 'c') {
                            break;
                        }
                    }
                }



                spin.clearThreeRolls();
                money--;
            } while (choice == 'p');

    }

}
