//you have to find the row lenght and column lenght and traverse the std::array//
import java.util.Scanner;

public class RowLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        sc.nextLine();

        String s[][] = new String[r][c];

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println("Enter element at [" + i + "][" + j + "]: ");
                s[i][j] = sc.nextLine();
            }
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println(s[i][j]);
            }
            System.out.println();
        }
    }
}

