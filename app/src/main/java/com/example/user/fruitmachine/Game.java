package com.example.user.fruitmachine;

/**
 * Created by user on 02/07/2017.
 */

public class Game {

    private UserInterface ui;
    private FruitMachine fruitMachine;
    private Player player;
    private Spin spin;

    public Game() {

        fruitMachine = new FruitMachine(100);
        player = new Player(10);
        spin = new Spin();
        ui = new UserInterface(spin);

    }

    public void playGame() {

        ui.promptPullLever();
        char choice = ui.action();
        gameLoop(choice);

        ui.pullOrCashOut();
        gameLoop(ui.action());


    }

    public void gameLoop(char choice) {

        while (choice == 'p') {
            spin.collectThreeRolls();
            spin.calculateSpinValue();
            ui.displaySpinResult();

            if (spin.calculateSpinValue() != 0) {
                ui.threeMatch();
                break;
            }

            spin.clearThreeRolls();
            ui.promptPullLever();
            choice = ui.action();
        }

    }

}
