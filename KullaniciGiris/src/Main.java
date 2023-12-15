import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 14.12.2023 //
        // Kullanıcıdan kullanıcı adını ve şifreyi girmesini isteyin
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        String sifre = scanner.nextLine();
        if (kullaniciAdi.equals("Ömer")) {
            // Şifrenin doğruluğunu kontrol edin
            if (!Objects.equals(sifre, "12345")) {

                // Şifre yanlışsa kullanıcıya sıfırlamak isteyip istemediğini sorun
                System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
                String cevap = scanner.nextLine();

                // Kullanıcı sıfırlamak isterse
                if (cevap.equals("Evet")) {

                    // Yeni şifreyi girgesini isteyin
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String yeniSifre = scanner.nextLine();

                    // Yeni şifrenin eski şifre ile aynı olup olmadığını kontrol edin
                    if (yeniSifre.equals(sifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        // Şifreler aynı değilse şifreyi sıfırlayın
                        System.out.println("Şifre oluşturuldu.");
                    }
                } else {
                    // Kullanıcı sıfırlamak istemezse
                    System.out.println("Şifreniz sıfırlanmadı.");
                }
            } else {
                // Şifre doğruysa
                System.out.println("Şifreniz doğru.");
            }
        }
    }
}
