import java.util.Scanner;

/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL*/
public class Main {
    public static void main(String[] args) {
        System.out.print("Armut Kaç Kilo? ");
        Scanner inputA = new Scanner(System.in);
        double armut = inputA.nextDouble();

        System.out.print("Elma Kaç Kilo? ");
        Scanner inputE = new Scanner(System.in);
        double elma = inputE.nextDouble();

        System.out.print("Domates Kaç Kilo? ");
        Scanner inputD = new Scanner(System.in);
        double domates = inputD.nextDouble();

        System.out.print("Muz Kaç Kilo? ");
        Scanner inputM = new Scanner(System.in);
        double muz = inputM.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? ");
        Scanner inputP = new Scanner(System.in);
        double patlican = inputP.nextDouble();

        double tutar = (armut * 2.14) + (elma *3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);

        System.out.println("Toplam Tutar : " + tutar);
    }
}