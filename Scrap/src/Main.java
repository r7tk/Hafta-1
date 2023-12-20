import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myDouble);
        System.out.println(myInt);
    }
*/
    public class Main {
        public static void main(String[] args) {
/**    *   STRING DEN INTEGER'A ÇEVİRME (String TO int/float/byte/long):       *
 *  - Parseint ve valueof metotları kullanılır.
 *  - Parseint metodu valueof metoduna göre daha hızlıdır.
 *  - örneğin Parseint metodu int tipinde bir değer döndürür.
 *  - örneğin Valueof metodu Integer tipinde bir nesne döndürür.
 *       **/
            String sdeger = "10";
            int ideger = 20;
            int ideger2 = Integer.parseInt(sdeger); //parsint metodu ile string in int e cevrilmesi.
            int ideger3 = Integer.valueOf(sdeger);  //valueof metedu ile string in int e çevrilmesi.
            float fdeger4 = Float.parseFloat(sdeger);
            float fdeger5 = Float.valueOf(sdeger);
            byte bdeger6 = Byte.parseByte(sdeger);
            byte bdeger7 = Byte.valueOf(sdeger);
            long ldeger8 = Long.parseLong(sdeger);
            long ldeger9 = Long.valueOf(sdeger);
            System.out.println("String To Int Orn. Sonuç1 : " + (ideger + ideger2));
            System.out.println("String To Int Orn. Sonuç2 : " + (ideger / ideger2));
            System.out.println("String To float Orn. Sonuç1 : " + fdeger4);
            System.out.println("String To float Orn. Sonuç2 : " + fdeger5);
            System.out.println("String To byte Orn. Sonuç1 : " + bdeger6);
            System.out.println("String To byte Orn. Sonuç2 : " + bdeger7);
            System.out.println("String To long Orn. Sonuç1 : " + ldeger8);
            System.out.println("String To long Orn. Sonuç2 : " + ldeger9);
        }

    }
