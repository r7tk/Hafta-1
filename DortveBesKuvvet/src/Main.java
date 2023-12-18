import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Sayı Giriniz :");
        int a = input.nextInt();

        for (int i = 1, j = 1; i <= a || j <= a; i *= 4, j *= 5) {
            if (i <= a) {
                System.out.println("4'ün Katı : "+i);
            }
            if (j<=a) {
                System.out.println("5'ün Katı : "+j);
            }
        }
    }
}