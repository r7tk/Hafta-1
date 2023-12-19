public class AsalSayilar {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            if (isAsal(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Asal
    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) { // Math classlarını daha kullanmadım geri dönüp kodu incele.
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
