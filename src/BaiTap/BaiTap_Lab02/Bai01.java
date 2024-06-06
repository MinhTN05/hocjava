package BaiTap.BaiTap_Lab02;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình ax + b = 0");
        System.out.print("Nhập vào giá trị a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào giá trị b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phương trình này có vô số nghiệm.");
        } else if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phương trình %dx + %d = 0 \n", a, b);
            System.out.printf("Phương trình có một nghiệm x = %.3f ", x);
        }
        scanner.close();
    }
}
