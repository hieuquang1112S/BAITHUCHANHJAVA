import java.util.Scanner;

public class AppBai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        while (tong <= 100){
            System.out.print("Nhap so: ");
            tong += sc.nextInt();
        }
        System.out.println("Tong cac so vua nhap: " + tong);
    }
}
