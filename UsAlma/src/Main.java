import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n^k için n değerini giriniz: ");
        int n = input.nextInt();
        System.out.print("n^k için k değerini giriniz: ");
        int k = input.nextInt();
        int total = 1;
        for (int i = 0; i < k; i++){
            total *= n;
        }

        System.out.println(n + "^" + k + " = " + total);
    }
}