import java.util.Scanner;

public class App81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Nhap ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu hang " + (i + 1) + ", cot " + (j + 1) + ": ");
                a[i][j] = sc.nextInt();
            }
        }
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran: " + max);
    }
}
