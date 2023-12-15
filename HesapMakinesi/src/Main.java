import java.util.Scanner;
public class Main {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        // BURADA KULLANICIDAN İSTENİLECEK VERİLERİN KODLARI YER ALMAKTA //
        System.out.println("#######################\n1.ci Sayıyı Giriniz .\n#######################");
        int sayi1 = scan.nextInt();
        System.out.println("#######################\n2.ci Sayıyı Giriniz .\n#######################");
        int sayi2 = scan.nextInt();
        // KULLANICI İÇİN OLUŞTURULMUŞ MENU REFERANSI
        System.out.println("#######################" +
                "\n 1 . TOPLAMA" +
                "\n 2 . ÇIKARTMA" +
                "\n 3 . ÇARPMA" +
                "\n 4 . BÖLME" +
                "\n 5 . MOD ALMA");


        System.out.println("#######################\nLütfen Klavyeden Ekranda Gösterilen \n" +
                "Seçenekleri Giriniz.\n####################### ");
        int secim = scan.nextInt();
        // İstenilen switch case ile menu oluşturuldu. default girildi . ilaveten mod almada menüye dahil edildi.//
        switch (secim){
            case 1 :
                System.out.println("Toplama İşleminizin Sonucu  "+(sayi1+sayi2));
                break;
            case 2 :
                System.out.println("Çıkartma İşleminizin Sonucu  "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma İşleminizin Sonucu  "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2 == 0){
                    System.out.println("Hiçbir Sayı Sıfıra Bölünemez.");
                }else {
                    System.out.println("Bölme işleminizin Sonucu  "+(sayi1/sayi2));
                }
                break;
            case 5:
                System.out.println("Mod Alma İşleminizin Sonucu  "+(sayi1%sayi2));
                break;
            default:
                System.out.println("Klavyeden Yanlış Tuş girişi yaptınız Tekrar Deneyiniz");
                break;


        }
    }
}