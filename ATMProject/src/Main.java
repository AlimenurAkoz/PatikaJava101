import javax.swing.event.ListDataListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int denemeHakki = 3;
        String kullanici = "Umay";
        String sifre = "123";
        double bakiye = 5950.0;
        System.out.println("Merhaba!");
        while (denemeHakki != 0) {
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            String kullaniciAdi = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz: ");
            String kullaniciSifresi = input.nextLine();

            if (kullaniciAdi.equals(kullaniciAdi) && kullaniciSifresi.equals(sifre)) {
                int islem;

                do {
                    System.out.println("1 - Para Çekme\n" +
                            "2 - Para Yatırma\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    islem = input.nextInt();
                    switch (islem) {

                        case 1:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                            int miktar = input.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Yetersiz Bakiye!");
                            } else {
                                bakiye -= miktar;
                                System.out.println("İşleminiz gerçekleşti. Bakiyeniz: " + bakiye);
                            }
                            break;
                        case 2:
                            System.out.println("Yatıracağınız miktarı giriniz: ");
                            int price = input.nextInt();
                            bakiye += price;
                            System.out.println("İşlem tamamlandı. Bakiyeniz: " + bakiye);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                    }
                } while (islem != 4);
                System.out.println("Hesabınızdan çıkış yapıldı! İyi günler:) ");
                break;
            } else {
                denemeHakki--;
                if (denemeHakki == 0) {
                    System.out.println("Hesabınız bloke oldu! Lütfen bankanız ile iletişime geçmelisin!");
                } else {
                    System.out.println("Kalan deneme hakkınız: " + denemeHakki);
                }
            }
        }


    }
}