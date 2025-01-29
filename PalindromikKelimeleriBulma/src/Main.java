import java.util.Scanner;

public class Main {
    public static boolean isPolindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }else{
            return false;
        }
        //return str.equals(reverse);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Polindrom kontrolü yapılacak kelime: ");
        String word = input.nextLine();
        System.out.println(isPolindrome(word));
        System.out.println(isPalindrome2(word));
    }
}