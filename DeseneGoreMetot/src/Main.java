import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = input.nextInt();
        islem islem = new islem();
        islem.azaltvearttir(sayi);


    }
    public static class islem {
        public void azaltvearttir (int sayi){
            if (sayi <= 0){
                System.out.print(sayi+" ");
                return;
            }
            System.out.print(sayi+" ");
            sayi -=5;
            azaltvearttir(sayi);
            sayi +=5;
            System.out.print(sayi+" ");
        }
    }
}
