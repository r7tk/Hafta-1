import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double PerKM = 0.10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi KM türünden giriniz : ");
        double distanceKm = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz : ");
        int age = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int tripType = scanner.nextInt();
        double totalPrice = distanceKm * PerKM;

        if (distanceKm <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");


        }

        if (age < 12) {
            totalPrice *= 0.5;

        } else if (age >= 12 || age <= 24) {
            totalPrice *= 0.9;

        } else if (age > 25 || age < 65) {
            totalPrice *= 1;

        } else if (age >= 65) {
            totalPrice *= 0.7;
        }
        if (tripType == 2) {
            totalPrice *= 0.8;
        }
                System.out.println("Toplam Tutar =" +   totalPrice  + " TL");


    }
}




