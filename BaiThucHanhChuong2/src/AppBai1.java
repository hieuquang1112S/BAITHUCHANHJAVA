import java.util.Scanner;

public class AppBai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        System.out.println("Tong cua 2 so: " + (a + b));
        System.out.println("Hieu cua 2 so: " + (a - b));
        System.out.println("Tich cua 2 so: " + (a * b));
        System.out.println("Thuong cua 2 so: " + ((double)a / b));
        System.out.println("Chia lay du cua 2 so: " + (a % b));
        if (a > b){
            System.out.println("So thu nhat lon hon");
        } else if (a < b){
            System.out.println("So thu hai lon hon");
        } else {
            System.out.println("2 so bang nhau");
        }
    }
}
