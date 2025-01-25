import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matris boyutunu giriniz(mxn): ");
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] matris = new int[m][n];

        //matris yazdırma
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matris[i][j] = scan.nextInt();
            }
        }

        //matrisin transpozunu alma
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matris[j][i]+ " ");
            }
            System.out.println();
        }
    }
}