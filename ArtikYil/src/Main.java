import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* 4 e bölünecek ve 100 ün katlarında 400'ün katı olarak sayılacak */

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Girini :");
        int year = input.nextInt();

        if ((year % 4 == 0) && year %100 !=0 || (year % 400 == 0)) {
            System.out.println(year + " Artık Yıldır.");
        } else {
            System.out.println(year + " Artık Yıl Değildir.");
        }
    }
}

