import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hava sıcaklığını girin: ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Dışarı çok soğuk. Kalın Giyinin!");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Hava serin. Hafif bir mont giyebilirsiniz.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Hava ılıman. T-shirt giyebilirsiniz.");
        } else if (sicaklik >= 25 && sicaklik < 35) {
            System.out.println("Sıcak! Şort ve tişört tercih edilebilir.");
        } else {
            System.out.println("Dışarı çok sıcak. Serin bir yerde kalın!");
        }

        scanner.close();
    }
}
