package Week1;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("1'den 100'e kadar olan asal sayılar :");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
