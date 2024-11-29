import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");

        int basSayisi = input.nextInt();

        //basamaklarda dolaşmak için
        for (int i = 0; i < basSayisi; i++){
            //yıldızlar için
            for (int j = 0;j < ((basSayisi - i)*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}