import java.util.Scanner;

public class App90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        int length = s.length();
        System.out.println("Cac ki tu co trong chuoi: ");
        for (int i = 0; i < length; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
