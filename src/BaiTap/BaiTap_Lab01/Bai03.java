package BaiTap.BaiTap_Lab01;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh của một khối lập phương: ");
        int a = scanner.nextInt();
        double pow = Math.pow(a, 3);
        System.out.println("Thể tích khối lập phương: " + pow);
        scanner.close();
    }
}
