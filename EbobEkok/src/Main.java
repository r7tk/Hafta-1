import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        int num2 = scan.nextInt();

        int ebob = 1;
        int ekok = 1;

        if (num1 == 0 || num2 == 0) {
            ebob = Math.max(num1, num2);
            ekok = Math.min(num1, num2);
        } else {
            int i = 1;
            while (i <= num1 && i <= num2) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            ekok = num1 * num2 / ebob;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}