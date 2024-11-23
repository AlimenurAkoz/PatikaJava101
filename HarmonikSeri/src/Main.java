import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik serisi hesaplanacak sayıyı giriniz:");

        int sayi = input.nextInt();

        double harmonik = 0.0;

        for (int i = 1; i <= sayi; i++){
            harmonik += (1 / i);
        }

        System.out.println(sayi + " sayısının harmonik serisi = " + harmonik);
    }
}