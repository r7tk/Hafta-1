import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = scanner.nextInt();
/////////////////////////////////////////////////////////////
        if (asalMi(sayi)) {
            System.out.println(sayi+" Sayı ASALDIR");
        } else {
            System.out.println(sayi+" Sayı Asal Değildir");
        }
    }
/////////////////////////////////////////////////////////////
    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }

        for (int i = 2; i * i <= sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}
