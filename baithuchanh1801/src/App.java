
import java.util.Scanner;

import javax.crypto.interfaces.DHKey;   
public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a1, b1, c1;
        double a2, b2, c2;
        double D, Dx, Dy;
        double x, y;
        System.out.println("hay nhap a1: ");
        a1 = scanner.nextDouble();
        System.out.println("hay nhap b1: ");
        b1 = scanner.nextDouble();
        System.out.println("hay nhap c1: ");
        c1 = scanner.nextDouble();
        System.out.println("hay nhap a2: ");
        a2 = scanner.nextDouble();
        System.out.println("hay nhap b2: ");
        b2 = scanner.nextDouble();
        System.out.println("hay nhap c2: ");
        c2 = scanner.nextDouble();
        System.out.println("gia tri cua a1: "+a1);
        System.out.println("gia tri cua b1: "+b1);
        System.out.println("gia tri cua c1: "+c1);
        System.out.println("gia tri cua a2: "+a2);
        System.out.println("gia tri cua b2: "+b2);
        System.out.println("gia tri cua c2: "+c2);
        D= a1*b2-a2*b1;
        Dx= c1*b2-b1*c2;
        Dy= a1*c2-a2*c1;
        if((D==0) && (Dx==0) && (Dy==0)) {
            System.out.println("hệ có vô số nghiệm");
        }
        if((D==0) && ((Dx!=0) || (Dy!=0))) {
            System.out.println("hệ vô nghiệm");
        }
        if(D!=0){
            x=Dx/D;
            y=Dy/D;
            System.out.println("hệ có 1 nghiệm");
            System.out.println(x);
            System.out.println(y);
        }
    }
}