import java.util.Scanner;

public class App2203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapThongTin(scanner);
        hcn.inThongTin();
        Person p = new Person();
        p.nhapThongTin(scanner);
        p.inThongTin();
        SinhVien sv = new SinhVien();
        sv.nhapThongTin(scanner);
        sv.inThongTin();
        PhuongTrinhBacHai ptbh = new PhuongTrinhBacHai();
        ptbh.nhapHeSo(scanner);
        ptbh.giaiPhuongTrinh();
        ptbh.inKetQua();
    }
}
