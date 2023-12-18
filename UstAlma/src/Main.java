import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz : ");
        long sayi = input.nextLong();

        System.out.print("Sayının Kuvvet Değeri Giriniz : ");
        long kuvvet = input.nextLong();
        long total = 1;
        for (int i = 0 ; i<kuvvet ; i++ ){
            total *= sayi;
        }
        System.out.println("Değer : "+total);
        }
    }
