import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18 , kdvTutar , kdvliTutar;


        /*Kullanıcıdan alınan değeri sırası ile kdvsiz tutarını kdv oranını
        kdv tutarını ve toplam kdvli fiyatını göstermekte*/


        Scanner girdi = new Scanner(System.in);
        System.out.print("Fiyatı Giriniz : ");
        tutar = girdi.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar:"+ tutar +" TL");
        System.out.println("KDV Oranı :" + kdvOran + " TL");
        System.out.println("KDV Tutarı :" + kdvTutar + " TL");
        System.out.println("KDV'li Tutarı :" + kdvliTutar + " TL");

    }
}