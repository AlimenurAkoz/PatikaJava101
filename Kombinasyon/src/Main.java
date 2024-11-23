import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //C(n,r) = n!/(r!*(n-r)!)
        Scanner input = new Scanner(System.in);

        System.out.print("C(n,r) için n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("C(n,r) için r değerini giriniz: ");
        int r = input.nextInt();

        int kombinasyon;
        int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int farkFaktoriyel = 1; //(n-r)!
        for (int i = 1; i <= n; i++){
            nFaktoriyel = nFaktoriyel * i;
        }

        for (int i = 1; i <= r; i++){
            rFaktoriyel = rFaktoriyel * i;
        }

        for (int i = 1; i <= n-r; i++){
            farkFaktoriyel = farkFaktoriyel * i;
        }

        kombinasyon = nFaktoriyel / (rFaktoriyel * farkFaktoriyel);

        System.out.println("C(n,r) = " + kombinasyon);
    }
}