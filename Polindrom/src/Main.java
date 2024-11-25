import java.util.Scanner;

public class Main {
    static boolean isPolindrome(int number){
        int sonRakam;
        int tersSayi = 0;
        int temp = number;
        while (number != 0){
            sonRakam = number%10;
            tersSayi = (tersSayi * 10) + sonRakam;
            number /= 10;
        }
        if (tersSayi == temp){
            System.out.println(temp + ", sayısı polindrom bir sayıdır.");
            return true;
        }else{
            System.out.println(temp + ", polindrom sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol edilmesini istediğiniz sayıyı giriniz: ");
        int number = input.nextInt();
        isPolindrome(number);
    }
}