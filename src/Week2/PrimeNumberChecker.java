package Week2;
import java.util.Scanner;

public class PrimeNumberChecker {
    // Recursive method to check if a number is prime
    static boolean isPrime(int number, int i) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number % i == 0) {
            return false;
        }
        if (i * i > number) {
            return true;
        }
        return isPrime(number, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}

