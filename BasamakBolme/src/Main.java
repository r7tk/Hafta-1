import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamaklarının Hesaplanmasını istediğiniz Sayıyı Giriniz : ");
        int sayi = input.nextInt();
        int toplam = 0;

        while (sayi != 0){
            toplam += sayi % 10 ;
            sayi /= 10;
        }
        System.out.println("Toplam Sayılar : "+toplam);
    }
}