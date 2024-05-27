package Week4.AdventureGame;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Safe House.");
        System.out.println("Your health is fully restored.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());

        if (this.getPlayer().hasAllRewards()) {
            System.out.println("Congratulations! You have collected all the rewards and won the game!");
            return false; // Oyunun bitmesi
        }

        return true;
    }
}
