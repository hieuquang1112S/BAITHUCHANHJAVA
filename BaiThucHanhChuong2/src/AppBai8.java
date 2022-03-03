import java.util.Scanner;

public class AppBai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day so: ");
        int n = sc.nextInt();
        int tong = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            tong += sc.nextInt();
            dem++;
        }
        System.out.println("Trung binh cong cac so vua nhap: " + ((double) tong / dem));
    }
}
