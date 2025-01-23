import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {5,2,80,49,35,1};
        int temp;

        //SIRALAMA
        for (int i = 0; i < dizi.length-1; i++){
            for (int j = 0; j < dizi.length-i-1; j++){
                if (dizi[j] > dizi[j+1]){
                    temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }

        }

        //YAZDIRMA
        for (int sayi : dizi){
            System.out.print(sayi + " ");
        }

        System.out.println();
        
        Scanner giris = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");

        int yeniSayi = giris.nextInt();
        int kucuk = -1;
        int buyuk = -1;

        for (int i = 0; i < dizi.length - 1; i++){
            if (yeniSayi > dizi[i] && yeniSayi < dizi[i+1]){
                kucuk = dizi[i];
                buyuk = dizi[i+1];
                break;
            }
        }

        if (yeniSayi > dizi[dizi.length - 1]){
            kucuk = dizi[dizi.length - 1];
        }
        if (yeniSayi < dizi[0]){
            buyuk = dizi[0];
        }

        if (kucuk != -1){
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucuk);
        }else {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı!");
        }

        if (buyuk != -1){
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyuk);
        }else {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı!");
        }



    }
}