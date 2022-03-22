
import java.util.Calendar;
import java.util.Scanner;

public class SinhVien {
    private String maSinhVien, hoTen, diaChi;
    private boolean gioiTinh;
    private Calendar ngaySinh;

    public void nhapThongTin(Scanner scanner){
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        int choice;
        do {
            System.out.println("Nhap gioi tinh: ");
            System.out.println("1. Nam");
            System.out.println("2. Nu");
            System.out.print("Lua chon cua ban la: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice != 1 && choice != 2);
        gioiTinh = choice == 1;
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        int ngay = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap thang sinh: ");
        int thang = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap nam sinh: ");
        int nam = Integer.parseInt(scanner.nextLine());
        ngaySinh.set(nam, thang, ngay);
    }

    public void inThongTin(){
        System.out.print("Ma sinh vien: " + maSinhVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Gioi tinh: " + (gioiTinh ? "Nam" : "Nu"));
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Ngay sinh: " +ngaySinh.get(Calendar.DAY_OF_MONTH) + "/" + ngaySinh.get(Calendar.MONTH) + "/" + ngaySinh.get(Calendar.YEAR));
    }
}
