import java.util.Scanner;

public class AppBai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        int thuong = 0, hoa = 0;
        int length = s.length();
        System.out.println("Cac ki tu thuong trong chuoi: ");
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                System.out.print(s.charAt(i) + " ");
                thuong++;
            }
        }
        System.out.println("\nSo ki tu thuong: " + thuong);
        System.out.println("Cac ki tu hoa trong chuoi: ");
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                System.out.print(s.charAt(i) + " ");
                hoa++;
            }
        }
        System.out.println("\nSo ki tu hoa: " + hoa);
    }
}
