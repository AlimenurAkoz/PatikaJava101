import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifre: ");
        sifre = input.nextLine();

        String onay;

        if ((kullaniciAdi.equals("Patika")) & (sifre.equals("Java101"))){
            System.out.println("Başarıyla giriş yapıldı!");
        }else{
            System.out.println("GİRİŞ YAPILAMADI! Şifreyi sıfırlamak ister misiniz? (E/H)");
            onay = input.nextLine();
            if (onay.equals("H")){
                System.out.println("Bilgileri kontrol ederek tekrar giriş yapınız!");
            }else if (onay.equals("E")){
                System.out.print("Yeni şifrenizi giriniz:" );
                sifre = input.nextLine();

                if (sifre.equals("Java101")) System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                else System.out.println("Şifre oluşturuldu.");
            }else{
                System.out.println("Geçerli bir ifade giriniz (Evet ise E, Hayır ise H)");
            }

        }
    }
}