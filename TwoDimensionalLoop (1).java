import java.util.Scanner;
public class TwoDimensionalLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int colm = scanner.nextInt();

        int[][] a = new int[rows][colm];

        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Two-dimensional array elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
