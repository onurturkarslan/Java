package Week2;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 3, 2, 7, 8, 8, 4, 6, 7};

        System.out.println("Tekrar Eden Çift Sayılar:");
        findDuplicateEvenNumbers(numbers);
    }

    public static void findDuplicateEvenNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

