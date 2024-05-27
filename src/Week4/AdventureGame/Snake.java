package Week4.AdventureGame;

import java.util.Random;

public class Snake extends Obstacle {

    private static final int MIN_DAMAGE = 3;
    private static final int MAX_DAMAGE = 6;

    public Snake() {
        super(4, "Snake", getRandomDamage(), 12, 0); // Award value is set to 0, we will override with random reward
    }

    private static int getRandomDamage() {
        Random random = new Random();
        return random.nextInt(MAX_DAMAGE - MIN_DAMAGE + 1) + MIN_DAMAGE;
    }

    public Reward getReward() {
        return Reward.getRandomReward();
    }
}
