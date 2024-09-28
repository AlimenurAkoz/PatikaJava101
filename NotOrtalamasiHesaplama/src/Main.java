import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, tarih, muzik;
        Scanner not = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        mat = not.nextInt();

        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = not.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = not.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = not.nextInt();

        System.out.print("Tarih Notunu Giriniz: ");
        tarih = not.nextInt();

        System.out.print("Müzik Notunu Giriniz: ");
        muzik = not.nextInt();

        int toplamNot = mat + turkce + fizik + kimya + tarih + muzik;

        double ortalama = (toplamNot / 6);

        System.out.println("Öğrencinin ortalaması: " + ortalama);
        if (ortalama < 60)
            System.out.println("Sınıfta Kaldı!");
        else System.out.println("Sınıfı Geçti :) ");
    }
}