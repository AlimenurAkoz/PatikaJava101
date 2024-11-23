import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Elmasın büyüklüğü için bir sayı giriniz: ");

        int n = input.nextInt();

        int m = ((n-1)/2) + 1;//işlemlerde kolaylık olması için:
        for (int i = 1;i <= m; i++){
            for (int j = m-i; j >= 0; j--){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int x = m-1; x >= 1; x--){
            for (int i = m-x; i >= 0; i--){
                System.out.print(" ");
            }
            for (int j = (2*x)-1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}