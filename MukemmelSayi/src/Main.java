import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner rw = new Scanner(System.in);
        System.out.print("Çizdirmek istediğiniz Piramit için Değer Giriniz : ");
        int rows = rw.nextInt();


        //int rows = 10;  // Adjust the number of rows as needed

        // Outer loop for the number of rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for spaces before the asterisks
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing asterisks
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}