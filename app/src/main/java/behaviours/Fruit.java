package behaviours;

/**
 * Created by user on 30/06/2017.
 */

public enum Fruit {
    CHERRIES(1, "o|o"),
    BAR(2, "BAR"),
    SEVEN(3, "7"),
    JACKPOT(5, "£");

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
