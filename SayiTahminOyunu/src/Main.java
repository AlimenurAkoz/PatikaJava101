import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        /*Random rand = new Random();
        int number = rand.nextInt(100);*/

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        System.out.println(number);
        boolean isWin = false;
        boolean isWrong = false;//kullanıcı hatalı giriş yapınca

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
                if (!isWrong){//ilk hatalı giriş
                    isWrong = true;//En az kez hatalı giriş yapıldığını gösteririr.
                    System.out.println("Bir sonraki hatalı girişlerinizde hakkınızdan düşülecektir!");
                }else {
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hak: " + (5-(++right)));
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hak: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }

    }
}