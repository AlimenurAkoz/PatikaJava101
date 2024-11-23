import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");

        int sayi = giris.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        for (int i = 1; i <= sayi; i*=4){
            System.out.print(i + " ");
        }

        System.out.println("\n5'in kuvvetleri: ");
        for (int i = 1; i <= sayi; i*=5){
            System.out.print(i + " ");
        }
    }
}