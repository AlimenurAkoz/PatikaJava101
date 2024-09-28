import java.util.Scanner;

/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle
göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173*/
public class Main {
    public static void main(String[] args) {
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Scanner inputBoy = new Scanner(System.in);
        double boy = inputBoy.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        Scanner inputKilo = new Scanner(System.in);

        double kilo = inputKilo.nextDouble();

        double indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}