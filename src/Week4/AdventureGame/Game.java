package Week4.AdventureGame;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to Adventure Game !");
        System.out.print("Please enter your name : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hello " + player.getName() + " The Adventure Begins" );
        System.out.println("-----------------------------------------------------");
        System.out.println("Characters :");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("Area");
            System.out.println();
            System.out.println("1-Safe House");
            System.out.println("2-Tool Store");
            System.out.println("0-Exit");
            System.out.print("Please select where do you want to go :");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (location == null){
                System.out.println("Goodbye...");
                break;
            }

            if (!location.onLocation()){
                System.out.println("Game Over");
                break;
            }
        }


    }


}
