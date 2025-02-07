import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row, column;
    String[][] map;
    String[][] mines;
    int size;
    int numberMine;
    int randomRow, randomColumn;
    int locationCount;
    int[][] locations;
    int mineCount;

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public MineSweeper(int row1, int column1) {
        this.row = row1;
        this.column = column1;
        this.map = new String[row1][column1];
        this.mines = new String[row1][column1];
        this.size = row1 * column1;
        this.numberMine = this.size / 4;
        this.locations = new int[row1][column1];


        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                map[i][j] = "- ";
                mines[i][j] = "- ";
            }
        }
    }

    public void control(int row2, int column2) {
        while (true){
            if (row2 < 2 || column2 < 2){
                System.out.println("Lütfen 2x2 den daha küçük değerler girmeyiniz!");
                System.out.print("Satır sayısını girin (en az 2): ");
                row2 = scan.nextInt();
                System.out.print("Sütun sayısını girin (en az 2): ");
                column2 = scan.nextInt();
            }else {
                break;
            }
        }
    }


    public void printSweeper(String[][] arr) {
        for (String[] strings : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }

    public void defineMine() {
        int count = 0;
        while (count < numberMine) {
            randomRow = random.nextInt(this.row);
            randomColumn = random.nextInt(this.column);
            if (!mines[randomRow][randomColumn].equals("* ")) {
                mines[randomRow][randomColumn] = "* ";
                // map[randomRow][randomColumn] = "* ";
                count++;
            }
        }
    }

    public void play(int playRow, int playColumn) {
        if (playRow >= this.row || playColumn >= this.column || playRow < 0 || playColumn < 0) {
            System.out.println("Geçerli koordinatlar giriniz!");
            return;
        } else if (isThere(playRow, playColumn)) {
            System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin!");
            return;
        } else {
            locations[playRow][playColumn] = 1;
            if (mines[playRow][playColumn].equals("* ")) {
                System.out.println("Mayın! KAYBETTİNİZ!");
                printSweeper(mines); // Oyun sonunda mayınları göster
                System.exit(0); // Oyunu bitir
            } else {
                int mineCount = controlMine(playRow, playColumn);
                map[playRow][playColumn] = mineCount + " ";
                printSweeper(map);
            }
        }

        // Tüm noktalar açıldıysa kazanma kontrolü
        if (checkWin()) {
            System.out.println("Tebrikler! Tüm noktaları açtınız. Oyunu kazandınız!");
            System.exit(0); // Oyunu bitir
        }
    }

    public boolean isThere(int x, int y) {
        return locations[x][y] == 1;
    }

    public boolean checkWin() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (map[i][j].equals("- ") && !mines[i][j].equals("* ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public int controlMine(int r, int c) {
        mineCount = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = r + i;
                int newCol = c + j;

                if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < column) {
                    if (mines[newRow][newCol].equals("* ")) {
                        mineCount++;
                    }
                }
            }
        }
        return mineCount;
    }

    public void run() {
        System.out.println("Oyun başlıyor...");
        System.out.println("Mayınlar dağıtılıyor...");
        printSweeper(map);
        System.out.println();
        System.out.println();
        defineMine();
        printSweeper(mines);
        while (true) {
            System.out.print("Satır giriniz: ");
            int playRow = scan.nextInt();
            System.out.print("Sütun giriniz: ");
            int playColumn = scan.nextInt();
            System.out.println("=================");
            play(playRow, playColumn);
        }
    }
}