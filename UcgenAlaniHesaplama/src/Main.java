import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Üçgenin her bir kenarının uzunluğunu sırayla giriniz...");
        System.out.print("1. Kenar = ");
        int kenar1 = input.nextInt();

        System.out.print("2. Kenar = ");
        int kenar2 = input.nextInt();

        System.out.print("3. Kenar = ");
        int kenar3 = input.nextInt();

        int cevre = kenar1 + kenar2 + kenar3;
        double yariCevre = cevre / 2;

        double alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre -kenar3));
        System.out.println("Üçgenin Alanı = " + alan);
    }
}