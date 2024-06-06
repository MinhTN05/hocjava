package BaiTap.BaiTap_Lab02;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất               |");
        System.out.println("| 2. Giải phương trình bậc hai                |");
        System.out.println("| 3. Tính số tiền điện                        |");
        System.out.println("| 4. Kết thúc                                 |");
        System.out.println("++ ----------------------------------------- ++");
        System.out.print("Lựa chọn của bạn: ");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println("1. Giải phương trình bậc nhất");
                giaiPhuongTrinhBacNhat();
                break;
            case 2:
                System.out.println("2. Giải phương trình bậc hai");
                giaiPhuongTrinhBacHai();
                break;
            case 3:
                System.out.println("3. Tính số tiền điện ");
                tinhSoDien();
                break;
            case 4:
                System.out.println("4. Kết thúc ");
                break;
            default:
                System.out.println("Chọn không hợp lệ.");
                System.exit(0);
        }
    }

    public static void giaiPhuongTrinhBacNhat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào giá trị b: ");
        int b = scanner.nextInt();
        System.out.printf("Phương trình %dx + %d = 0 \n", a, b);
        if (a == 0 && b == 0) {
            System.out.println("Phương trình này có vô số nghiệm.");
        } else if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phương trình có một nghiệm x = %.3f ", x);
        }
        scanner.close();
    }

    public static void giaiPhuongTrinhBacNhat1(int a, int b) {
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

    public static void giaiPhuongTrinhBacHai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào giá trị b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào giá trị c: ");
        int c = scanner.nextInt();
        System.out.printf("Phương trình %dx^2 + %dx + %d = 0 \n", a, b, c);
        if (a == 0) {
            giaiPhuongTrinhBacNhat1(b, c);
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

    public static void tinhSoDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tính tiền điện");
        System.out.print("Nhập vào số điện: ");
        int a = scanner.nextInt();
        if (a <= 100) {
            int money = a * 1000;
            System.out.println("Số tiền điện = " + money);
        } else {
            int money = 100 * 1000 + (a - 100) * 1500;
            System.out.println("Số tiền điện = " + money);
        }
        scanner.close();
    }


}
