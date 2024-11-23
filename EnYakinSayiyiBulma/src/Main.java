import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,85,-5,47,57,0,25,-20};
        ArrayList<Object> numbers2 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: ");
        int sayi = input.nextInt();
        numbers2.add(sayi);

        int temp;

        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = 0; j < numbers.length -i-1; j++){
                if (numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers2));

        /*for (int i = 0; i < numbers.length ; i++){

        }*/

    }
}