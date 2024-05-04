package Week2;

public class BLetter {
    public static void main(String[] args) {
        int row, column;
        int size = 4; // Boyutu ayarlayın

        for (row = 1; row <= size * 2 + 1; row++) {
            for (column = 1; column <= size * 2; column++) {
                if ((row == 1 || row == size * 2 + 1) && (column % 2 != 0)) {
                    System.out.print("* ");
                } else if ((column == 1 || column == size * 2) && (row != 1 && row != size * 2 + 1)) {
                    System.out.print("* ");
                } else if (row == size + 1 && column % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

