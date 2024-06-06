package BaiTap;

import java.util.Scanner;

public class BaiTap_Dieu_Kien {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng              |");
        System.out.println("| 2. Trừ               |");
        System.out.println("| 3. Kết thúc          |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lựa chọn của bạn là : ");
        int value = scanner.nextInt();

        switch (value){
            case 1:
                System.out.println("Bạn đã lựa chọn phép cộng");
                break;
            case 2:
                System.out.println("Bạn đã lựa chọn phép trừ");
                break;
            case 3:
                System.out.println("Bạn đã lựa chọn thoát chương trình");
                break;
            default:
                System.out.println("Mày không biết đọc chữ à!!!!!!");
                System.exit(0);
        }
    }
}
