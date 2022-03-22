import java.util. Scanner;

public class AppBai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = sc.nextInt();

        if (a % 2 == 1){
            System.out.println("So le");
        } else {
            System.out.println("So chan");
        }
    }
}
