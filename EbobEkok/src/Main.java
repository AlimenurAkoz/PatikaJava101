import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 0, ekok= 0;
        int kucukSayi;
        int buyukSayi;
        if (sayi1 < sayi2) {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        }else {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        }

        //EBOB BULMA
        int bolen = 1;
        while (bolen <= kucukSayi){
            if (sayi1%bolen == 0 && sayi2%bolen == 0){
                ebob = bolen;
            }
            bolen++;
        }
        System.out.println("Sayıların EBOB'u = " + ebob);

        //EKOK BULMA
        int kat = buyukSayi;
        while (kat <= sayi1 * sayi2){
            if (kat % sayi1 == 0 && kat % sayi2 == 0){
                ekok = kat;
                break;
            }
            kat++;
        }
        System.out.println("Sayıların EKOK'u = " + ekok);

    }
}