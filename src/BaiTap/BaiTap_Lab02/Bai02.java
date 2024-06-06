package BaiTap.BaiTap_Lab02;

import java.util.Scanner;

public class Bai02 {

    public static void giaiPhuongTrinhBacNhat(int a, int b) {
        System.out.printf("Phương trình %dx + %d = 0 \n", a, b);
        if (a == 0 && b == 0) {
            System.out.println("Phương trình này có vô số nghiệm.");
        } else if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phương trình có một nghiệm x = %.3f ", x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình ax^2 + bx + c = 0");
        System.out.print("Nhập vào giá trị a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào giá trị b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào giá trị c: ");
        int c = scanner.nextInt();

        System.out.printf("Phương trình %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0) {
            giaiPhuongTrinhBacNhat(b, c);
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.printf("Phương trình này có nghiệm kép x = %.3f", x);
            } else {
                double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình này có 2 nghiệm riêng biệt x1 và x2.");
                System.out.printf("Phương trình này có x1 = %.3f \n", x1);
                System.out.printf("Phương trình này có x2 = %.3f \n", x2);
            }
        }
        scanner.close();
    }
}
