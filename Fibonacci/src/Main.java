import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int sayi = input.nextInt();

        int fibonacci = 0, a = 1;

        for (int i = 0; i < sayi; i++) {
            System.out.print(fibonacci+" - ");
            int gecici = fibonacci + a;
            a = fibonacci;
            fibonacci = gecici;

        }
    }
}
