import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = input.nextInt();
        int toplamSayi = 0 ;

        for(int i = 1; i < sayi; i++){
            if (sayi%i ==0){
                toplamSayi += i;
            }
        }
        if (sayi == toplamSayi){
            System.out.print("Sayı Mükemmel Sayıdır.");
        }
        else {
            System.out.print("Sayı Mükemmel Değildir.");
        }
    }
}


