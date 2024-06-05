import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập giá trị b: ");
        int b = scanner.nextInt();
        int c = Math.max(a, b);
        int d = Math.min(a, b);
        System.out.println("Max = " + c);
        System.out.println("Min = " + d);
        scanner.close();
    }
}