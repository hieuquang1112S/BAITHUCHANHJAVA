import shape.Point;
import shape.Quadrilateral;
import shape.Triangle;

import java.util.Scanner;

public class App2604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point p = new Point();
        p.nhap(scanner);
        p.inTT();
        Triangle t = new Triangle();
        t.check(scanner);
        Quadrilateral q = new Quadrilateral();
        q.check(scanner);
    }
}
