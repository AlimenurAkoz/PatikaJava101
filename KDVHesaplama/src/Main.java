import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girilenDeger = new Scanner(System.in);

        System.out.print("Para miktarını giriniz: ");
        double miktar = girilenDeger.nextDouble();

        double kdvOrani = 0.18;
        double kdvMiktari = miktar * (kdvOrani);
        double kdvliFiyat = miktar + kdvMiktari;

        if (0 < miktar && miktar <= 1000){
            System.out.println("KDV Oranı = " + kdvOrani);
            System.out.println("KDV Miktarı = " + kdvMiktari);
            System.out.println("KDV'li Fiyat = " + kdvliFiyat);
        } else if (1000 < miktar) {
            kdvOrani = 0.08;
            System.out.println("KDV Oranı = " + kdvOrani);
            System.out.println("KDV Miktarı = " + kdvMiktari);
            System.out.println("KDV'li Fiyat = " + kdvliFiyat);
        }

    }
}