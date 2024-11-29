import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Kaç adet sayı gireceksiniz? : ");

        int n = input.nextInt();

        if (n <= 0){
            System.out.println("Geçerli bir sayı giriniz!");
            return;
        }
        int[] sayilar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            sayilar[i] = sayi;
        }

        int enbuyuk = sayilar[0];
        int enKucuk = sayilar[0];

        for (int i = 0; i < n; i++){
            //en büyük bulma
            if (enbuyuk < sayilar[i]){
                enbuyuk = sayilar[i];
            }
            //en küçük bulma
            if (sayilar[i] < enKucuk) {
                enKucuk = sayilar[i];
            }
        }
        System.out.println("En büyük sayı: " + enbuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}