import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.println("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.println("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.println("Muzik Notunuz :");
        muzik = input.nextInt();

        /*  Eğer girilen veriler 100 ve 0'a eşit yada daha küçük ise "Notlar 0 ile 100 arasında olabilir çıktısı ver."*/

        if (0 <= mat && mat <= 100 && 0 <= turkce && turkce <= 100 && 0 <= fizik && fizik <= 100
                && 0 <= kimya && kimya <= 100 && 0 <= muzik && muzik <= 100) {
            double ortalama = (double) (mat + turkce + fizik + kimya + muzik) / 5;
            System.out.println(" Not Ortalaması " + ortalama);
        } else {
            System.out.println("Notlar 0 ile 100 arasında olmalıdır.");
        }
        input.close();
    }
}