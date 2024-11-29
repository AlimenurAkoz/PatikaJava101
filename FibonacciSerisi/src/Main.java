import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int[] fib = new int[n];

        if (n >= 2) {
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 1; i < n - 1; i++) {
                fib[i + 1] = fib[i] + fib[i - 1];
            }
        }else if (n == 1){
            fib[0] = 0;
        }

        System.out.println(Arrays.toString(fib));
    }
}