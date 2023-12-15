import java.util.Scanner;
    public class Main {
        public static void main(String[] args){
            // değişkenler tanımlandı .
            int a , b ;
            double c ;

            Scanner input = new Scanner(System.in);
            //Kullanıcıdan Değerlerin girilmesi isteniyor.
            System.out.println("Birinci Kenarı Giriniz: ");
            a = input.nextInt();
            System.out.println("İkinci Kenarı Giriniz: ");
            b = input.nextInt();
            c = Math.sqrt((a*a)+(b*b)); // bu kısmı bilmiyordum :)
            System.out.println("Hipotenus Değeri : "+ c);

        }
}