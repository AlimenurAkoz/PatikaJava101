import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value1, value2, operation;

        Scanner input = new Scanner(System.in);
        System.out.print("İşlem yapılacak 1. sayıyı giriniz: ");
        value1 = input.nextInt();

        System.out.print("İşlem yapılacak 2. sayıyı giriniz: ");
        value2 = input.nextInt();

        System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme");

        operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Toplama işlemi sonucu = " + (value1 + value2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu = " + (value1 - value2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu = " + (value1 * value2));
                break;
            case 4:
                double bolum;
                bolum = (double) value1 / value2;
                if (value2 != 0) System.out.println("Bölme işlemi sonucu = " + bolum);
                else System.out.println("0'a bölünme işlemi yapılamaz!");
                break;
            default:
                System.out.println("TANIMLANAMAYAN İŞLEM!!");
        }
    }
}