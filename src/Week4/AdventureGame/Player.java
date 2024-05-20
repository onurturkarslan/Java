package Week4.AdventureGame;

import java.util.Scanner;

public class Player {
    private int damage;
    private int healt;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

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
                    "\t Healt :" + gameChar.getHealt()+
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
        this.setHealt(gameChar.getHealt());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());

    }
    public void printInfo(){
        System.out.println("Weapon : " + this.getInventory().getWeapon().getName() +
                ", Armor : " + this.getInventory().getArmor().getName() +
                ", Blocked : " + this.getInventory().getArmor().getBlock() +
                ", Damage : " + this.getDamage() +
                ", Healt : " + this.getHealt() +
                ", Money : " + this.getMoney());
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
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
}
