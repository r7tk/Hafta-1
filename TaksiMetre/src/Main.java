import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int Km;
        double perKm = 2.2 , total , startPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz :");
        Km = input.nextInt();
        total = (Km * perKm);
        // Başlangıç değeri ile beraber total değerini yazdırır //
        total += startPrice;


        /* Girilen ücret eğer 20 TL nin altında ise minimum 20 TL olduğu için 20 TL yazdırır
        Eğer değil ise total değeri yazdırır */

        total=(total < 20) ? 20 : total;
        System.out.print("Toptam Tutar : " + total + " TL");


    }
}