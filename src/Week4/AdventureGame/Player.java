package Week4.AdventureGame;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private Set<String> collectedRewards = new HashSet<>();

    public Player (String name){
        this.name = name;
        this.inventory = new Inventory();
    }
    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-----------------------------------------------------");
        for (GameChar gameChar : charList){
            System.out.println(gameChar.getName()+
                    "\t Damage :" + gameChar.getDamage()+
                    "\t Health :" + gameChar.getHealth()+
                    "\t Money :" + gameChar.getMoney());
        }
        System.out.println("-----------------------------------------------------");
        System.out.print("Please select a character :");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
        }
        System.out.println(this.getCharName() + " choosed");
    }


    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());

    }
    public void printInfo(){
        System.out.println("Weapon : " + this.getInventory().getWeapon().getName() +
                ", Armor : " + this.getInventory().getArmor().getName() +
                ", Blocked : " + this.getInventory().getArmor().getBlock() +
                ", Damage : " + this.getTotalDamage() +
                ", Health : " + this.getHealth() +
                ", Money : " + this.getMoney());
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
    public void addReward(String reward) {
        collectedRewards.add(reward);
    }

    public boolean hasAllRewards() {
        return collectedRewards.contains("Food") &&
                collectedRewards.contains("Firewood") &&
                collectedRewards.contains("Water") &&
                collectedRewards.contains("Money") &&
                collectedRewards.contains("Weapon") &&
                collectedRewards.contains("Armor");
    }

    public boolean hasReward(String reward) {
        return collectedRewards.contains(reward);
    }
}
