import java.util.Scanner;

/*Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
 Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan
 sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/

public class Main {
    public static void islem(int sayi, int n) {
        if (sayi <= 0) {
            System.out.print(sayi + " ");
            return;
        }
        System.out.print(sayi + " ");
        islem(sayi - 5, n);
        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Kullanılacak n değeri giriniz: ");
        int n = input.nextInt();
        islem(sayi, n);
    }
}