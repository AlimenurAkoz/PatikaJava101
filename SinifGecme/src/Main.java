import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, turkce, kim, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (0 > mat || mat > 100){
            System.out.println("Geçerli bir not giriniz! ");
            mat = input.nextInt();
        }

        System.out.print("Fizik notunuz: ");
        fiz = input.nextInt();
        if (0 > fiz || fiz > 100){
            System.out.println("Geçerli bir not giriniz! ");
            fiz = input.nextInt();
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (0 > turkce || turkce > 100){
            System.out.println("Geçerli bir not giriniz! ");
            turkce = input.nextInt();
        }

        System.out.print("Kimya notunuz: ");
        kim = input.nextInt();
        if (0 > kim || kim > 100){
            System.out.println("Geçerli bir not giriniz! ");
            kim = input.nextInt();
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (0 > muzik || muzik > 100){
            System.out.println("Geçerli bir not giriniz! ");
            muzik = input.nextInt();
        }

        double avarage = (mat + fiz + turkce + kim + muzik) /5;

        if (avarage < 55) System.out.println("Sınıfta kaldınız!");
        else System.out.println("Geçtiniz!");

        System.out.println("Ortalamanız: " + avarage);
    }
}