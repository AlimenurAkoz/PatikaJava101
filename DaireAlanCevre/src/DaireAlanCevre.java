import java.util.Scanner;

/*Dairenin Alanını ve Çevresini Hesaplayan Program
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Ödev ----> Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360*/
public class DaireAlanCevre {
    public static void main(String[] args) {
        double pi = 3.14;
        System.out.print("Yarıçap değerinin giriniz: ");
        Scanner input1 = new Scanner(System.in);

        System.out.println("Daire dilimin merkez açısını giriniz: ");
        Scanner input2 = new Scanner(System.in);

        int yaricap = input1.nextInt();
        int aci = input2.nextInt();

        double alan = pi * (yaricap * yaricap);
        double dilimAlan = (alan * aci) / 360;

        System.out.println("Alan = " + dilimAlan);
    }
}
