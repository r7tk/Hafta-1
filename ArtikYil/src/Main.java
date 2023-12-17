import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int girdi = input.nextInt();
        int enBuyukSayi = 0, enKucukSayi = 0;


        // en büyük ve en küçük sayıyı tutacak değişkenlere 0 değerini girdik
        // Alt tarafta işlerken hata veriyordu.


        for (int i = 1; i <= girdi; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            int sayi = input.nextInt();
            if (i == 1) {

                enBuyukSayi = sayi;
                enKucukSayi = sayi;

            } else {
                if (sayi > enBuyukSayi) {
                    enBuyukSayi = sayi;
                } else if (sayi < enKucukSayi) {
                    enKucukSayi = sayi;

                }
            }
        }
        System.out.println("En büyük sayı : " + enBuyukSayi);
        System.out.println("En kücük sayı : " + enKucukSayi);
    }

}
