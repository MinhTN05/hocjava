package BaiTap;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int a = scanner.nextInt();
        System.out.print("Nhập chiều rộng:");
        int b = scanner.nextInt();
        int cv = (a + b)*2;
        int dt = a * b;
        int min = Math.min(a, b);
        System.out.println("Chu vi hình chữ nhật là: " + cv);
        System.out.println("Diện tích hình chữ nhật là: " + dt);
        System.out.println("Cạnh nhỏ nhất hình chữ nhật là: " + min);
        scanner.close();
    }
}
