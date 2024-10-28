import java.util.Scanner;

/*döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 3 ve 4'e tam bölünen sayıların ortalamasını hesaplama*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int sayac = 0;

        for (int i = 1; i <= sayi - 1; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
            }
        }

        if (sayac != 0) {
            double ortalama = toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalması: " + ortalama);
        }

    }
}