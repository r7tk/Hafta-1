import java.util.Scanner;

public class Kat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        System.out.println("Sayı girişlerini yapın. Tek bir sayı girdiğinizde program sonlanacaktır.");

        while (true) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }

            // Kullanıcı tek bir sayı girdiğinde döngüden çıkılır.
            if (sayi % 2 != 0) {
                break;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);

        scanner.close();
    }
}