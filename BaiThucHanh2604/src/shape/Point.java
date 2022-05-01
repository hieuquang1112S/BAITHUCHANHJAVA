package shape;

import java.util.Scanner;

public class Point {
    private char ten;
    private double hoanhDo, tungDo;

    public Point() {
    }

    public Point(char ten, double hoanhDo, double tungDo) {
        this.ten = ten;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public void nhap(Scanner scanner){
        System.out.print("Nhap ten: ");
        ten = scanner.nextLine().trim().charAt(0);
        System.out.print("Nhap hoanh do: ");
        hoanhDo = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Nhap tung do: ");
        tungDo = Double.parseDouble(scanner.nextLine().trim());
    }

    public void inTT(){
        System.out.print(ten + "(" + hoanhDo + "," + tungDo + ")");
    }

    public char getTen() {
        return ten;
    }

    public void setTen(char ten) {
        this.ten = ten;
    }

    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

}
