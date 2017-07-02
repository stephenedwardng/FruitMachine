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

        char choice = 'p';
        gameLoop(choice);

//        while (choice == 'p') {
//            ui.pullOrCashOut();
//            gameLoop(ui.action());
//            break;
//        }
        ui.cashOut();


    }

    public void gameLoop(char choice) {

        do {
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
        } while (choice == 'p');

    }

}
