package Week3;
//Revize
// Rastgele bir şekilde mayınları yerleştirebilmek ve girdilerimiz için, Random ve Scanner sınıflarımızı oluşturalım.

import java.util.Random;
import java.util.Scanner;

// MineSweeper klasımızı oluşturalım.
public class MineSweeper {

    // Değişkenlerimizi tanımlayalım.
    private final char MINE = '*';
    private final char UNOPENED = '-';
    private final int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
    private final int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};
    private char[][] board;
    private boolean[][] opened;
    private boolean[][] isMine;
    private int rows;
    private int cols;
    private int totalMines;
    private int openedCount;
    private boolean gameOver; // Oyunun bitip bitmediğini kontrol eden değişken

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new char[rows][cols];
        this.opened = new boolean[rows][cols];
        this.isMine = new boolean[rows][cols];
        this.totalMines = rows * cols / 4; // 1/4 of total cells
        this.openedCount = 0;
        this.gameOver = false; // Oyunun başlangıçta bitmediğini belirtir
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = UNOPENED;
            }
        }
    }

    // Mayınları oluşturalım.
    private void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;
        while (minesPlaced < totalMines) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(cols);
            if (!isMine[row][col]) {
                isMine[row][col] = true;
                minesPlaced++;
            }
        }
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < rows && y < cols;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Hücrelerin metotu.
    public void openCell(int x, int y) {
        if (!isValid(x, y)) {
            System.out.println("Invalid coordinates. Please enter valid coordinates.");
            System.out.println("====================================================");
            return;
        }
        if (opened[x][y]) {
            System.out.println("This cell is already opened. Please choose another cell.");
            System.out.println("========================================================");
            return;
        }
        if (isMine[x][y]) {
            System.out.println("===============================");
            System.out.println("Game Over!!");
            opened[x][y] = true;
            printMineLocations();
            System.out.println("===============================");
            gameOver = true; // Oyunun bittiğini belirtir
            return;
        }

        int minesAround = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isValid(nx, ny) && isMine[nx][ny]) {
                minesAround++;
            }
        }
        board[x][y] = (char) (minesAround + '0');
        opened[x][y] = true;
        openedCount++;
        if (openedCount == rows * cols - totalMines) {
            System.out.println("==================================");
            System.out.println("Congratulations! You won the game!");
            System.out.println("==================================");
            printBoard();
            System.out.println("==================================");
            gameOver = true; // Oyunun bittiğini belirtir
            return;
        }
        if (minesAround == 0) {
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isValid(nx, ny) && !opened[nx][ny]) {
                    openCell(nx, ny);
                }
            }
        }
        printBoard();
    }

    // Mayınların nerede olduğunu gösteren board metotu.
    public void printMineLocations() {
        System.out.println("Mine Locations:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isMine[i][j]) {
                    System.out.print(MINE + " ");
                } else {
                    System.out.print(UNOPENED + " ");
                }
            }
            System.out.println();
        }
    }
    public boolean isGameEnded() {
        return openedCount == rows * cols - totalMines || gameOver;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true; // Oyunun tekrar başlaması için flag
        while (playAgain) { // Oyunun tekrar başlaması durumunda
            System.out.println("Welcome to MineSweeper Game!");
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();
            if (rows < 2 || cols < 2) {
                System.out.println("Number of rows and columns should be at least 2. Please enter valid values.");
                System.out.println("===========================================================================");
                continue; // Yeni bir oyun başlatmak için döngüyü tekrar başlat
            }
            MineSweeper mineSweeper = new MineSweeper(rows, cols);
            System.out.println("==========================================================");
            mineSweeper.printMineLocations();
            System.out.println("==========================================================");
            System.out.println("Game Board:");
            mineSweeper.printBoard();
            System.out.println("==========================================================");
            while (!mineSweeper.isGameEnded()) {
                System.out.print("Enter the row number: ");
                int row = scanner.nextInt();
                System.out.print("Enter the column number: ");
                int col = scanner.nextInt();
                mineSweeper.openCell(row, col);
            }
            // Oyun bitince tekrar başlamak isteyip istemediğini sorgula
            while (true) {
                System.out.print("Do you want to play again? (Y/N): ");
                String playAgainInput = scanner.next().toUpperCase();
                if (playAgainInput.equals("N")) {
                    playAgain = false; // Oyunu tekrar başlatmamak için flag'i false yap
                    break; // Dıştaki while döngüsünü kır
                } else if (playAgainInput.equals("Y")) {
                    break; // Yeni bir oyun başlatmak için döngüyü kır
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            }
        }
        System.out.println("Thank you for playing! Goodbye!");
    }

}
