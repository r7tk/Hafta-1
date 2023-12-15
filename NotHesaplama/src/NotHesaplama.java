import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args){
        // Değişkenleri oluştur//
        int mat, fizik, kimya, turkce, tarih, mzk;
        // Scanner sıfımızı tanımladık
        Scanner notlar = new Scanner(System.in);
        // Kullanıcıdan değer al
        System.out.print("Matematik Notunuzu Giriniz :");
        mat=notlar.nextInt();
        System.out.print("Fizik Notunuzu Giriniz :");
        fizik=notlar.nextInt();
        System.out.print("Kimya Notunuzu Giriniz :");
        kimya=notlar.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce=notlar.nextInt();
        System.out.print("Tarih Notunuzu Giriniz :");
        tarih=notlar.nextInt();
        System.out.print("Müzik Notunuzu Giriniz :");
        mzk=notlar.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + mzk);
        double sonuc = toplam / 6.0;
        // Hesaplanan Değeri Double ile bölüp sonuç kısmına yazdırır.
        System.out.print("Ortalamanız :"+ sonuc);
    }
}
