package Cau_Dieu_Kien;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tax = ");
        int tax = scanner.nextInt();
        if (tax < 10) {
            System.out.println("Không đóng thuế.");
        } else if (10 <= tax && tax <= 15) {
            System.out.println("Đóng thuế 10%.");
        } else if (15 < tax && tax <= 30) {
            System.out.println("Đóng thuế 20%.");
        } else {
            System.out.println("Đóng thuế 30%.");
        }

        scanner.close();
    }
}

