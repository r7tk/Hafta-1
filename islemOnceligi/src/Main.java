import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a , b , c ;

        // Yapılacak işlemle ilgili kullanıcıyı bildirim yapılıyor.

        System.out.println("====================================");
        System.out.println("İşleme göre a + b * c - b olacaktır.");
        System.out.println("====================================");

        // Kullanıcıdan girdi bekleniyor.

        Scanner scan = new Scanner(System.in);
        System.out.printf("Lütfen -a- Değişkenini tamınlayınız :");
        a = scan.nextInt();
        System.out.printf("Lütfen -b- Değişkenini tamınlayınız :");
        b = scan.nextInt();
        System.out.printf("Lütfen -c- Değişkenini tamınlayınız :");
        c = scan.nextInt();

        // verilen formüle göre işlem yapılıp ekrana yazdırılıyor.

        int islem = a+b*c-b;
        System.out.println("İşleminizin Sonucu : " + islem);
    }
}