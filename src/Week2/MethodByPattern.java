package Week2;

import java.util.Scanner;

public class MethodByPattern {

    public static void recursiveMethod(int n, int initial) {

            if (n > 0) {
                System.out.print(n + " ");
                recursiveMethod(n - 5, initial);
            }
            if(n<=0 && n >= - initial){
                System.out.print(-n + " ");
                recursiveMethod(n - 5, initial);
            }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Lütfen bir sayı giriniz : ");
        n = input.nextInt();
        System.out.println("N Sayısı: " + n);
        recursiveMethod (n, n);
    }

}
