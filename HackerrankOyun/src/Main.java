import java.util.Scanner;

public class Main {

    public static boolean canWin(int leap, int[] game, int i) {
        int n = game.length;

        // Check if the current position is out of bounds or blocked
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // If we're at the last index or can leap beyond the last index
        if (i == n - 1 || i + leap >= n) {
            return true;
        }

        // Mark the current position as visited to avoid infinite loops
        game[i] = 1;

        // Try moving to the next position, previous position, or leap position
        return canWin(leap, game, i + 1) ||
                canWin(leap, game, i - 1) ||
                canWin(leap, game, i + leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();  // Read number of queries

        while (q-- > 0) {
            int n = scan.nextInt();  // Size of the game array
            int leap = scan.nextInt();  // Leap value

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();  // Read game array values
            }

            // Check if the player can win starting from index 0
            System.out.println(canWin(leap, game, 0) ? "YES" : "NO");
        }
        scan.close();
    }
}