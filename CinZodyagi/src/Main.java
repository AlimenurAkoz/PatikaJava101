import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int yil = input.nextInt();
        String burc;

        //burç hesabı
        int mod = yil%12;
        switch (mod){
            case 0:
                System.out.println("Çin Zodyağı'na göre burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı'na göre burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı'na göre burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı'na göre burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı'na göre burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı'na göre burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı'na göre burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı'na göre burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı'na göre burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı'na göre burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı'na göre burcunuz: At");
                break;
            case 11:
                System.out.println("Çin Zodyağı'na göre burcunuz: Koyun");
                break;
        }
    }
}