import java.util.Scanner;

public class AppBai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        int dem = 0;
        char c;

        String t;
        do {
            System.out.print("Nhap ki tu: ");
            t = sc.nextLine().trim();
        } while (t.length() == 0);
        c = t.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                dem++;
            }
        }
        System.out.println("Ki tu " + c + " xuat hien " + dem + " lan");
    }
}
