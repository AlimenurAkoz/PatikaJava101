/*Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklık değerini giriniz: ");

        sicaklik = input.nextInt();

        if (sicaklik <= 5) System.out.println("Bugün kayak yapabilirsiniz:)");
        else if (5 < sicaklik & sicaklik < 10) System.out.println("Bugün sinemaya gidebiliriniz:)");
        else if (10 <= sicaklik & sicaklik <= 15) System.out.println("Bugün sinemaya gidebilir veya piknik yapabilirsiniz:)");
        else if (15 < sicaklik & sicaklik < 25) System.out.println("Bugün piknik yapabilirsiniz:)");
        else if (25 <= sicaklik) System.out.println("Bugün yüzmeye gidebilirsiniz:)");
    }
}