import java.util.Scanner;

public class AppBai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nguyen duong: ");
            n = sc.nextInt();
        } while (n <= 0);
        int gt = 1;
        for (int i = 2; i <= n; i++) {
            gt *= i;
        }
        System.out.println("Giai thua cua " + n + ": " + gt);
    }
}
