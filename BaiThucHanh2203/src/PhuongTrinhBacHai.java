import java.util.Scanner;

public class PhuongTrinhBacHai {
    private int a, b, c, soNghiem;
    private double x1, x2;

    public void nhapHeSo(Scanner scanner){
        System.out.print("Nhap he so a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap he so b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap he so c: ");
        c = Integer.parseInt(scanner.nextLine());
    }

    public void giaiPhuongTrinh(){
        double delta = b*b - 4*a*c;
        if (delta > 0){
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            soNghiem = 2;
        } else if (delta == 0){
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            soNghiem = 1;
        } else {
            soNghiem = 0;
        }
    }

    public void inKetQua(){
        if (soNghiem == 2){
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (soNghiem == 1){
            System.out.println("Phuong trinh co nghiem kep: ");
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
