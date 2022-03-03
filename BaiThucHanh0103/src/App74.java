import java.util.Scanner;

public class App74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100000];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0){
                tong += a[i];
            }
        }
        System.out.println("Tong cac phan tu chan trong mang: " + tong);
    }
}
