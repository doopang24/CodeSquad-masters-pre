package week2.mission2;

import java.util.Random;

class Gamer {
    int money;
    String fruit;
}

public class DiceGame {

    public int dice() {
        Random random = new Random();
        return random.nextInt(7) - 1;
    }

    public static void main(String[] args) {

    }
}
