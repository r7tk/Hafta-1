import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;


        System.out.println("Sayı girişlerini yapın. Tek bir sayı girdiğinizde program sonlanacaktır.");

        while (true) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (sayi % 4 == 0 ) {
                toplam += sayi;
            }
            if (sayi % 2 == 1  || sayi % 2 == -1) {
                break;
            }
        }

        System.out.println("Girilen 4'ün katı olan Çift Sayılar: " + toplam);

        scanner.close();
    }
}