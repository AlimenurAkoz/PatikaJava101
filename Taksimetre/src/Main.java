import java.util.Scanner;

/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Gidilecek mesafeyi KM cinsinden giriniz: ");
        Scanner kmDegeri = new Scanner(System.in);

        double mesafe = kmDegeri.nextDouble();

        int acilis = 10;

        double tutar = 10 + (mesafe * 2.20);

        double ucret = 20;

        if (tutar < 20){
            tutar = ucret;
            System.out.println("Taksimetre tutarı = " + tutar + "TL");
        }else
            System.out.println("Taksimetre tutarı = " + tutar + "TL");

    }
}

