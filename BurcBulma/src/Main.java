import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String burc = "";
        //değer alma
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz yılı giriniz: ");
        int yil = input.nextInt();

        System.out.print("Doğduğunuz ayı giriniz: ");
        int ay = input.nextInt();

        if (12 < ay || 0 >= ay) {
            System.out.println("GEÇERLİ BİR TARİH GİRİNİZ!");
            System.out.print("Doğduğunuz ay: ");
            ay = input.nextInt();
        }

        //geçerli gün kontrolü
        System.out.print("Doğduğunuz günü giriniz: ");
        int gun = input.nextInt();
        if (ay == 2) {
            if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
                if (29 < gun || gun <= 0) {
                    System.out.println("GEÇERLİ BİR GÜN GİRİNİZ!");
                    System.out.print("Doğduğunuz gün: ");
                    gun = input.nextInt();
                }
            } else {
                if (28 < gun || gun <= 0) {
                    System.out.println("GEÇERLİ BİR GÜN GİRİNİZ!");
                    System.out.print("doğduğunuz gün: ");
                    gun = input.nextInt();
                }
            }
        } else if (ay <= 8) {
            if ((ay == 8) || (ay % 2 != 0)) {
                if (31 < gun || gun <= 0) {
                    System.out.println("GEÇERLİ BİR GÜN GİRİNİZ!");
                    System.out.print("Doğduğunuz gün: ");
                    gun = input.nextInt();
                }
            } else {
                if (30 < gun || gun <= 0) {
                    System.out.println("GEÇERLİ BİR GÜN GİRİNİZ!");
                    System.out.print("Doğduğunuz gün: ");
                    gun = input.nextInt();
                }
            }
        } else {
            if (ay % 2 == 0) {
                if (31 < gun || gun <= 0) {
                    System.out.println("GEÇERLİ BİR GÜN GİRİNİZ!");
                    System.out.print("Doğduğunuz gün: ");
                    gun = input.nextInt();
                }
            } else {
                if (30 < gun || gun <= 0) {
                    System.out.println("GEÇERLİ BİR GÜN GİRİNİZ!");
                    System.out.print("Doğduğunuz gün: ");
                    gun = input.nextInt();
                }
            }
        }

        //Burç tespiti
        if (ay == 1) {
            if (gun <= 21) burc = "Oğlak";
            else burc = "Kova";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 2) {
            if (gun <= 19) burc = "Oğlak";
            else burc = "Balık";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 3) {
            if (gun <= 20) burc = "Balık";
            else burc = "Koç";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 4) {
            if (gun <= 20) burc = "Koç";
            else burc = "Boğa";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 5) {
            if (gun <= 21) burc = "Boğa";
            else burc = "İkizler";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 6) {
            if (gun <= 22) burc = "İkizler";
            else burc = "Yengeç";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 7) {
            if (gun <= 22) burc = "Yengeç";
            else burc = "Aslan";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 8) {
            if (gun <= 22) burc = "Aslan";
            else burc = "Başak";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 9) {
            if (gun <= 22) burc = "Başak";
            else burc = "Terazi";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 10) {
            if (gun <= 22) burc = "Terazi";
            else burc = "Akrep";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 11) {
            if (gun <= 21) burc = "Akrep";
            else burc = "Yay";
            System.out.println("Burcunuz: " + burc);
        } else if (ay == 12) {
            if (gun <= 21) burc = "Yay";
            else burc = "Oğlak";
            System.out.println("Burcunuz: " + burc);
        }
    }
}