import java.util.Scanner;

public class AppBai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.print("Nhap nam sinh cua ban: ");
        int a = sc.nextInt();

        if (a < 16){
            System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        } else if (a < 18){
            System.out.println("Ban " + name + " o do tuoi truong thanh");
        } else {
            System.out.println("Ban " + name + " da gia");
        }
    }
}
