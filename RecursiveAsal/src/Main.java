import java.util.Scanner;

public class Main {
    public static boolean asalMi(int sayi, int bolen) {
        if (bolen >= sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen + 1);


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        if (sayi == 0 || sayi == 1) {
            System.out.println(sayi + " sayısı ASAL değildir!");
        } else if (sayi == 2) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            if (asalMi(sayi, 2)) {
                System.out.println(sayi + " sayısı ASALDIR!");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir!");
            }
        }
    }
}