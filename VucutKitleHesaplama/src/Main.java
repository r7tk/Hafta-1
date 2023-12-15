import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double kilo , boy;
        Scanner indeks = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz : ");
        boy=indeks.nextDouble();
        System.out.print("Lütfen Kilonuzu giriniz :");
        kilo=indeks.nextDouble();

        double kti = kilo / (boy *boy);
        System.out.print("Vücud Kitle indeksiniz : " + kti);
        /* nedense birçok arkadaş Chat-GPT den direk almış çıktıları hata mı yapıyorum ? ilerlenilen konulara
        göre kodlarımı yazıyorum umarım pişman olmam :)*/
    }
}