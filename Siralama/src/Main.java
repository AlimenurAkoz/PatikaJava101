import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        double enKucuk = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextDouble();

        System.out.print("Üçüncü sayıyı giriniz: ");
        c = input.nextDouble();

        if (a == b){
            if (a < c) System.out.println(a + " = " + b + " < " + c);
            else if (a > c) System.out.println(c + " < " + a + " = " + b);
            else if (a == c) System.out.println(a + " = " + b + " = " + c);
        }else if (a == c){
            if (a < b) System.out.println(a + " = " + c + " < " + b);
            else if (a > b) System.out.println(b + " < " + a + " = " + c);
            else if (a == b) System.out.println(a + " = " + b + " = " + c);
        } else if (b == c){
            if (a < b) System.out.println(a + " < " + b + " = " + c);
            else if (a > b) System.out.println(b + " = " + c + " < " + a);
            else if (a == c) System.out.println(a + " = " + b + " = " + c);
        } else if ((a < b) & (a < c)){
            if (b < c){
                System.out.println(a + " < " + b + " < " + c);
            }else
                System.out.println(a + " < " + c + " < " + b);
        } else if ((b < a) & (b < c)) {
            if (a < c) System.out.println(b + " < " + a + " < " + c);
            else System.out.println(b + " < " + c + " < " + a);
        } else if ((c < a) & (c < b)) {
            if (a < b) System.out.println(c + " < " + a + " < " + b);
            else System.out.println(c + " < " + b + " < " + a);
        }
    }
}