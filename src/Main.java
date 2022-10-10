import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri row");
        int rows = scanner.nextInt();
        System.out.println("nhap gia tri cols");
        int clos = scanner.nextInt();
        int[][] twoArr = new int[rows][clos];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < clos; j++) {
                twoArr[i][j] = (int) (Math.random() * 11);
                System.out.print(twoArr[i][i] + " ");
            }
            System.out.println("\n");
        }
        int max = twoArr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < clos; j++) {
                if (max < twoArr[i][j]) {
                    max = twoArr[i][j];
                }
            }
        }
        System.out.println("max: " + max);
    }
}