package shape;

import java.util.Scanner;

public class Triangle extends Point{

    public void check( Scanner scanner){
        Point a, b, c;
        a = new Point();
        System.out.println("Nhap diem thu 1: ");
        a.nhap(scanner);
        b = new Point();
        System.out.println("Nhap diem thu 2: ");
        b.nhap(scanner);
        c = new Point();
        System.out.println("Nhap diem thu 3: ");
        c.nhap(scanner);
        double AB = khoangCach(a, b);
        double BC = khoangCach(b, c);
        double AC = khoangCach(a, c);

        if ((AB + AC) > BC && (BC + AC) > AB && (AB + BC) > AC){
            if (AB == BC && BC == AC){
                System.out.println("Tam giac deu");
            } else if (AB == BC || BC == AC || AB == AC){
                System.out.println("Tam giac can");
            } else if ((AB*AB + BC*BC == AC*AC) || (BC*BC + AC*AC == AB*AB) || (AB*AB + AC*AC == BC*BC)){
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Khong phai tam giac");
        }
    }

    public double khoangCach(Point a, Point b){
        return Math.sqrt(Math.pow(a.getHoanhDo() - b.getHoanhDo(), 2) + Math.pow(a.getTungDo() - b.getTungDo(), 2));
    }
}
