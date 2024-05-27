package Week4.AdventureGame;

import java.util.Random;

public enum Reward {
    NO_REWARD,
    PISTOL,
    SWORD,
    RIFLE,
    LIGHT_ARMOR,
    MEDIUM_ARMOR,
    HEAVY_ARMOR,
    MONEY_1,
    MONEY_5,
    MONEY_10;

    public static Reward getRandomReward() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        if (chance <= 15) return PISTOL;
        else if (chance <= 35) return SWORD;
        else if (chance <= 65) return RIFLE;
        else if (chance <= 80) return LIGHT_ARMOR;
        else if (chance <= 90) return MEDIUM_ARMOR;
        else if (chance <= 95) return HEAVY_ARMOR;
        else if (chance <= 97) return MONEY_1;
        else if (chance <= 99) return MONEY_5;
        else if (chance == 100) return MONEY_10;
        else return NO_REWARD;
    }
}
