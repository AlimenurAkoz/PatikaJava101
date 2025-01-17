import java.util.Scanner;

public class Main {
    public static void toplama() {
        double toplam = 0.0;
        double sayi;
        Scanner giris = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = giris.nextInt();
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = giris.nextDouble();
            toplam += sayi;
        }
        System.out.println("Sonuç = " + toplam);
    }

    public static void cikarma() {
        Scanner giris = new Scanner(System.in);
        System.out.print("Kaç adet sayı girilecek: ");
        int adet = giris.nextInt();
        double sonuc = 0.0;
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı: ");
            double sayi = giris.nextInt();

            if (i == 1) {//ilk girilen sayıyı çıkarılan olarak alıyor
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;//ilk sayıdan sonrakiler çıkarılıyor
        }
        System.out.println("Sonuç = " + sonuc);
    }

    public static void carpma() {
        Scanner giris = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        double sayi;
        double carpim = 1.0;
        int adet = giris.nextInt();

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = giris.nextDouble();
            carpim *= sayi;
        }
        System.out.println("Sonuç = " + carpim);
    }

    public static void bolme() {
        Scanner giris = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:  ");
        int adet = giris.nextInt();
        double sonuc = 0.0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            double sayi = giris.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Bölen 0 olamaz! ");
                continue;
            }

            if (i == 1) {
                sonuc = sayi;
                continue;
            }

            sonuc /= sayi;
        }
        System.out.println("Sonuç = " + sonuc);
    }

    public static void usluHesabi() {
        Scanner giris = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = giris.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = giris.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuç = " + sonuc);
    }

    public static void faktoriyel() {
        Scanner giris = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = giris.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println("Sonuç = " + sonuc);
    }

    public static void modAlma() {
        Scanner giris = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = giris.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = giris.nextInt();

        if (sayi2 == 0) {
            System.out.println("İkinci sayı 0 olamaz!");
            return;
        }
        int mod = sayi1 % sayi2;
        System.out.println("Sonuç = " + mod);

    }

    public static void dikdortgenHesabi() {
        Scanner giris = new Scanner(System.in);
        System.out.print("Kısa kenarın uzunluğunu giriniz: ");
        int kenar1 = giris.nextInt();
        System.out.print("Uzun kenarın uzunluğunu giriniz: ");
        int kenar2 = giris.nextInt();

        int alan = kenar1 * kenar2;
        int cevre = 2 * (kenar1 + kenar2);

        System.out.println("Dikdörtgenin alanı = " + alan + ", Dikdörtgenin çevresi = " + cevre);
    }


    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int islem;
        System.out.println(
                "1- Toplama İşlemi\n" +
                        "2- Çıkarma İşlemi\n" +
                        "3- Çarpma İşlemi\n" +
                        "4- Bölme işlemi\n" +
                        "5- Üslü Sayı Hesaplama\n" +
                        "6- Faktoriyel Hesaplama\n" +
                        "7- Mod Alma\n" +
                        "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "0- Sonlandır");

        do {
            System.out.print("İşlem seçiniz: ");
            islem = giris.nextInt();
            switch (islem) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usluHesabi();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgenHesabi();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçerli değer girmediniz!");
            }
        }while (islem != 0);
    }

}
