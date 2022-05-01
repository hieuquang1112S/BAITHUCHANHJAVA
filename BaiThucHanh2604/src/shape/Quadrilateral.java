package shape;

import java.util.Scanner;

public class Quadrilateral extends Point{
    public void check( Scanner scanner){
        Point a, b, c, d;
        a = new Point();
        System.out.println("Nhap diem thu 1: ");
        a.nhap(scanner);
        b = new Point();
        System.out.println("Nhap diem thu 2: ");
        b.nhap(scanner);
        c = new Point();
        System.out.println("Nhap diem thu 3: ");
        c.nhap(scanner);
        d = new Point();
        System.out.println("Nhap diem thu 4: ");
        d.nhap(scanner);
        double AB = khoangCach(a, b);
        double BC = khoangCach(b, c);
        double CD = khoangCach(c, d);
        double AD = khoangCach(a, d);

        if (AB == 0 || BC == 0 || CD == 0 || AD == 0){
            System.out.println("Khong phai tu giac");
        } else {
            if (AB == BC && BC == CD && CD == AD){
                System.out.println("Hinh vuong");
            } else if (AB == CD && BC == AD){
                System.out.println("Hinh binh hanh");
            }
        }
    }

    public double khoangCach(Point a, Point b){
        return Math.sqrt(Math.pow(a.getHoanhDo() - b.getHoanhDo(), 2) + Math.pow(a.getTungDo() - b.getTungDo(), 2));
    }
}
