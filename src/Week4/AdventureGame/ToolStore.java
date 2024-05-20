package Week4.AdventureGame;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to Store");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1- Weapons");
            System.out.println("2- Armors");
            System.out.println("3- Exit");
            System.out.print("Select :");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Select again :");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Goodbye...");
                    showMenu = false;
                    break;

            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + ": " + "Damage :" + w.getDamage() + ", " + "Price :" + w.getPrice());
        }
        System.out.println("0 - Exit");

    }

    public void buyWeapon(){
        System.out.print("Buy a Weapon :");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Select again :");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
            if (selectedWeapon != null){
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Not Enough Money");
                }else {
                    System.out.println(selectedWeapon.getName() + ", You bought this weapon");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining money : " + this.getPlayer().getMoney());
                    System.out.println("Previous Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Equiped Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }


    }


    public void printArmor() {
        System.out.println("Armors");
        for (Armor a : Armor.armors()){
            System.out.println(a.getId() + "-" + a.getName() + ": " + "Block :" + a.getBlock() + ", " + "Price :" + a.getPrice());
        }
        System.out.println("0 - Exit");
    }

    public void buyArmor(){
        System.out.print("Buy an Armor :");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.print("Select again :");
            selectArmorID = input.nextInt();
        }

        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if (selectedArmor != null){
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Not Enough Money");
                } else {
                    System.out.println(selectedArmor.getName() + ", You bought this Armor");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your remaining money : " + this.getPlayer().getMoney());
                }
            }
        }

    }


}
