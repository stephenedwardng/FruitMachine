package behaviours;

/**
 * Created by user on 30/06/2017.
 */

public enum Fruit {
    CHERRIES(5, "o|o"),
    BAR(20, "BAR"),
    SEVEN(60, "7"),
    JACKPOT(200, "£");

    private int value;
    private String fruitType;

    Fruit(int value, String fruitType) {
        this.value = value;
        this.fruitType = fruitType;
    }

    public int getValue() {
        return this.value;
    }

    public String getFruitType() {
        return this.fruitType;
    }
}
