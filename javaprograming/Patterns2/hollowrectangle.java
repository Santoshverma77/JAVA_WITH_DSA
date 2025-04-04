import java.util.*;

public class hollowrectangle {

    public static void logic(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows ");
        int row = sc.nextInt();
        System.out.println("enter number of colums ");
        int column = sc.nextInt();

        logic(row, column);
    }
}