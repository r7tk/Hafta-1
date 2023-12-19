import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("pardon") && password.equals("12345")) {
                System.out.println("Merhaba, BlackShark Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("\nPara miktarı : \n");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;

                        case 2:
                            System.out.print("\nPara miktarı : \n");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("\n BAKİYE YETERSİZ.\n");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;

                        case 3:
                            System.out.println("\n Bakiyeniz : " + balance +"\n");
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;

                        default:
                            System.out.println("\nGeçersiz işlem. Lütfen tekrar deneyin.\n");
                            break;
                    }
                } while (select != 4);

                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
