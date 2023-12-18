
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Faktoriyel hesaplaması için sayı giriniz : ");
        long faktoriyel = input.nextInt();
        System.out.print("Lütfen Kombinasyon hesaplaması için sayı giriniz : ");
        long kombinasyon = input.nextInt();

        long pay = 1;
        long payda = 1;

        for (long i = faktoriyel, j  = kombinasyon; j >= 1 ; pay *= i--,payda *=j--){
        }
        System.out.print(" Kombinasyonun sonucu : " + pay/payda );
    }
}