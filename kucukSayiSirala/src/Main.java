import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç farklı sayıyı klavyeden giriş ile alıyoruz
        System.out.print("1. Sayıyı girin: ");
        int a = scanner.nextInt();

        System.out.print("2. Sayıyı girin: ");
        int b = scanner.nextInt();

        System.out.print("3. Sayıyı girin: ");
        int c = scanner.nextInt();

        // Sayıları küçükten büyüğe sırala ve yazdır harf olarak sırala
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Sıralama: a < b < c");
            } else {
                System.out.println("Sıralama:  a  < c < b");
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Sıralama: b < a < c");
            } else {
                System.out.println("Sıralama: b < c < a");
            }
        } else {
            if (a <= b) {
                System.out.println("Sıralama: c < a < b");
            } else {
                System.out.println("Sıralama: c < b < a");
            }
        }

        scanner.close();
    }
}
