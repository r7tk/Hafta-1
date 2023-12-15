import java.util.Scanner;
public class main {
    public static void main(String[] args){

        // Sabit Fiyatları ürünleri ondalık olduğu için double kullanarak girdisini sağladık //

        double ArmutFiyat=2.14;
        double ElmaFiyat=3.67;
        double DomatesFiyat=1.11;
        double MuzFiyat=0.95;
        double PatlicanFiyat=5.00;

        // Kullanıcı tarafından istenilen girdileri girmek için scanner kullanıldı //
        Scanner scan = new Scanner(System.in);
        // Kullanıcı tarafından girilen girdileri yeni bir veri altında topladık
        System.out.print("Armut Kaç Kilo ?");
        double ArmutKilo=scan.nextDouble();
        System.out.print("Elma Kaç Kilo ?");
        double ElmaKilo=scan.nextDouble();
        System.out.print("Domates Kaç Kilo ?");
        double DomatesKilo=scan.nextDouble();
        System.out.print("Muz Kaç Kilo ?");
        double MuzKilo=scan.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?");
        double PatlicanKilo=scan.nextDouble();

        // Girilen girdileri fiyatları ile çarpıp ekrana " Toptam tutar " olarak yazdırdık //

        double toplamTutar=(ArmutKilo * ArmutFiyat )+(ElmaKilo * ElmaFiyat)+(DomatesKilo * DomatesFiyat)+(MuzKilo * MuzFiyat)+(PatlicanKilo*PatlicanFiyat);
        System.out.print("Toplam Tutar : "+toplamTutar + " TL");

    }
}