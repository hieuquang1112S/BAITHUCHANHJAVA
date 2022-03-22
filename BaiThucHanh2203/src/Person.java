import java.util.Scanner;

public class Person {
    private String personID, personName, address;
    private boolean gender;

    public void nhapThongTin(Scanner scanner){
        System.out.print("Nhap id: ");
        personID = scanner.nextLine();
        System.out.print("Nhap ten: ");
        personName = scanner.nextLine();
        int choice;
        do {
            System.out.println("Nhap gioi tinh: ");
            System.out.println("1. Nam");
            System.out.println("2. Nu");
            System.out.print("Lua chon cua ban la: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice != 1 && choice != 2);
        gender = choice == 1;
        System.out.print("Nhap dia chi: ");
        address = scanner.nextLine();
    }

    public void inThongTin(){
        System.out.println("ID: " + personID);
        System.out.println("Ten: " + personName);
        System.out.println("Gioi tinh: " + (gender ? "Nam" : "Nu"));
        System.out.println("Dia chi: " + address);
    }
}
