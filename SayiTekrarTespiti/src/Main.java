import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length; i++) {
            int count = 0;
            //eleman daha önce duplicate dizisinde bulunmuşsa atla
            if (isFind(duplicate,list[i])){
                continue;
            }

            for (int j = 0; j < list.length; j++){
                if (list[i] == list[j]){
                    count++;
                }
            }

            //tekrar eden elemanı duplicate dizisine ekleme
            if (count > 1){
                duplicate[startIndex++] = list[i];
            }

            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}