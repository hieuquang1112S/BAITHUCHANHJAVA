import java.util.Scanner;

public class HinhChuNhat {
    private double chieuDai, chieuRong;

    public void nhapThongTin(Scanner scanner){
        System.out.print("Nhap chieu dai: ");
        chieuDai = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap chieu rong: ");
        chieuRong = Double.parseDouble(scanner.nextLine());
    }

    public void inThongTin(){
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Dien tich: " + tinhDienTich());
    }

    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }

    public double tinhChuVi(){
        return (chieuRong + chieuDai) * 2;
    }
}
