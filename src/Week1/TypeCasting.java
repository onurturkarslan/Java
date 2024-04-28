package Week1;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tam sayı ve Ondalıklı değişken sayı alalım.
        System.out.print("Bir tam sayı giriniz: ");
        int number1 = input.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double number2 = input.nextDouble();


        Double number1Double = (double) number1;
        int number2Integer = (int) number2;

        System.out.println("Ondalığa çevrilmiş tam sayı: " + number1Double);
        System.out.println("Tam sayıya çevrilmiş ondalıklı sayı :" + number2Integer);


    }
}
