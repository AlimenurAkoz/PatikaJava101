import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;
        do {
            System.out.println("Oynamak istediğiniz alanı belirleyelim...");
            System.out.print("Satır sayısını giriniz: ");
            row = input.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            column = input.nextInt();
            if (row<2 || column<2){
                System.out.println("Matris boyutu en az 2x2 olmalıdır. Lütfen tekrar deneyin.");
            }
        }while (row<2 || column<2);
        MineSweeper mine = new MineSweeper(row, column);
        mine.control(row, column);
        mine.run();

    }
}