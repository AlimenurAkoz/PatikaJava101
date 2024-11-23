import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Bir sayı giriniz: ");
       int sayi = input.nextInt();

       int total = 0;

       while(sayi != 0){
           total += sayi % 10;
           sayi = sayi / 10;
       }

        System.out.println("Basamak sayıları toplamı = " + total);
    }
}