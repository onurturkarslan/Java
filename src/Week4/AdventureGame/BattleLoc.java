package Week4.AdventureGame;

import java.util.Random;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    private boolean rewardCollected;
    private Random random = new Random();

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
        this.rewardCollected = false;
    }

    @Override
    public boolean onLocation() {
        if (rewardCollected) {
            System.out.println("Bu bölgeyi daha önce temizlediniz. Başka bir yere gidin.");
            return true;
        }

        int obsNumber = this.randomObstacleNumber();

        System.out.println("Şuan buradasınız: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor.");
        System.out.print("<S>avaş veya <K>aç :");
        String selectCase = input.nextLine().toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)) {
            System.out.println(this.getName() + " You Won!");
            rewardCollected = true;
            getPlayer().addReward(award);
            return true;
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Game Over");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);

            boolean isPlayerTurn = random.nextBoolean();

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                if (isPlayerTurn) {
                    System.out.print("<H>it or <E>scape : ");
                    String selectCombat = input.nextLine().toUpperCase();
                    if (selectCombat.equals("H")) {
                        System.out.println("You hit!");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println("Ops! obstacle hits you...");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }
                    } else {
                        return false; // Escape
                    }
                } else {
                    System.out.println("Obstacle hits you...");
                    int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (obstacleDamage < 0) {
                        obstacleDamage = 0;
                    }
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                    afterHit();
                    if (this.getPlayer().getHealth() > 0) {
                        System.out.print("<H>it or <E>scape : ");
                        String selectCombat = input.nextLine().toUpperCase();
                        if (selectCombat.equals("H")) {
                            System.out.println("You hit!");
                            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        } else {
                            return false; // Escape
                        }
                    }
                }
                isPlayerTurn = !isPlayerTurn;
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("You Won!");
                System.out.println("Earned : " + this.getAward());
                getPlayer().addReward(this.getAward());
                System.out.println("Current Money : " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Your Health : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Obstacle Health : " + this.getObstacle().getHealth());
    }

    public void playerStats() {
        System.out.println("Player Stats");
        System.out.println("------------------------------");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Money : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Stats");
        System.out.println("------------------------------");
        System.out.println("Health : " + this.getObstacle().getHealth());
        System.out.println("Damage : " + this.getObstacle().getDamage());
        System.out.println("");
    }

    public int randomObstacleNumber() {
        return random.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
