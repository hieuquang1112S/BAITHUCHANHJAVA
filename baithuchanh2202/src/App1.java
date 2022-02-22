import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        while (a != b){
            if (a > b){
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Uoc chung lon nhat cua 2 so: " + a);
    }
}
