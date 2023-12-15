import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini al
        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Girdi kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            // Mesafe başına ücret
            double birimUcret = 0.10;

            // Toplam fiyat hesaplama
            double toplamFiyat = mesafe * birimUcret;

            // İndirim uygulama
            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                toplamFiyat *= 0.7; // %30 indirim
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8; // %20 indirim
            }

            // Sonucu ekrana yazdır
            System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");
        }

        scanner.close();
    }
}
