import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yas;
        double mesafe;
        int yolculuk;

        //VERİ ALMA VE VERİ KONTROLÜ
        do {
            System.out.print("Yaşınızı girin: ");
            yas = input.nextInt();
            if (yas < 0) System.out.println("Hatalı Veri Girdiniz!");
        }while (yas < 0);

        do {
            System.out.print("Gidilecek mesafeyi KM cinsinden girin: ");
            mesafe = input.nextDouble();
            if (mesafe < 0){
                System.out.println("Hatalı Veri Girdiniz!");
            }
        }while(mesafe < 0);


        do {
            System.out.print("Tek yön yolculuk için '1', gidiş-dönüş yolculuk için '2' değerini giriniz: ");
            yolculuk = input.nextInt();
            input.nextLine();

            if (yolculuk != 1 && yolculuk != 2){
                System.out.println("Hatalı Veri Girdiniz!");
            }
        } while (yolculuk != 1 && yolculuk != 2);


        //BİLET TUTARI HESAPLAMA

       //Normal bilet tutarı
        double tamTutar = mesafe * 0.10;
        double tutar;
        if (yas <= 12){
            tutar = tamTutar - (tamTutar * 0.5);
        } else if (12 < yas && yas < 24) {
            tutar = tamTutar - (tamTutar * 0.1);
        } else if (yas > 65) {
            tutar = tamTutar - (tamTutar * 0.3);
        }else
           tutar = tamTutar;

        if (yolculuk == 2){
            tutar = tutar - (tutar * 0.2);
        }

        System.out.println("Bilet ücretiniz: " + tutar);
    }
}