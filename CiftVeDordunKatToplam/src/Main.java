import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
  girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
        Scanner giris = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        do {
            System.out.println("Sayı giriniz: ");
            sayi = giris.nextInt();
            if ((sayi % 2) == 0 && (sayi % 4) == 0){
                toplam += sayi;
            }
        }while ((sayi % 2) == 0);
        System.out.println("Sonuç: " + toplam);
    }
}