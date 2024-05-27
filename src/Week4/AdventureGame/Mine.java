package Week4.AdventureGame;

import java.util.Random;

public class Mine extends BattleLoc {
    private Random random = new Random();

    public Mine(Player player) {
        super(player, "Mine", new Snake(), "", 5);
    }

    private String getRandomReward() {
        // Olası ödüller
        String[] possibleRewards = {"Money", "Weapon", "Armor"};

        // Rastgele bir ödül seçme
        return possibleRewards[random.nextInt(possibleRewards.length)];
    }
}