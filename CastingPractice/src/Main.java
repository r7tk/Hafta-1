import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Tam Bir Sayı Giriniz : ");
        int tamSayi = input.nextInt();

        System.out.print("Lütfen Ondalıklı Bir Sayı Giriniz(Virgül Kullanınız) :");
        double ondalik = input.nextDouble();

        System.out.print("Lütfen Bir Karakter Giriniz : ");
        char karakter = input.next().charAt(0);


        System.out.println("Girilen Tam Sayınız : "+tamSayi);
        System.out.println("Girilen Ondalıklı Sayınız : "+ondalik);
        System.out.println("Girilen Karakteriniz : " +karakter+"\n");

        double ondalikSayi = tamSayi;
        int tamSayidonus = (int) ondalik;
        int asciideger = (char) karakter;

        System.out.println("Tam Sayıdan Dönüştürülen Ondalık Sayınız : " +ondalikSayi+"\n");
        System.out.println("Ondalık Sayıdan Dönüştürülün Tam Sayınız : " +tamSayidonus+"\n");
        System.out.println("Char Karakteri İnte Dönüştürülmesi Sonucu : "+asciideger +"\n");

    }
}