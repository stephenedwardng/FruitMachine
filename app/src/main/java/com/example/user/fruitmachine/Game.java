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

    public void gameLoop(char choice) {

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

                spin.clearThreeRolls();
                money--;
            } while (choice == 'p');

    }

}
