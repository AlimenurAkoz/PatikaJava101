public class Main {
    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 6, 7, 3, 2, 2, 9, 10, 21, 6, 1, 33, 10, 1};
        int[] duplicate = new int[list.length];//tekrar edenlerin dizisi
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                        }
                        break;
                    }
                    break;
                }
            }
        }

        /* duplicate'in uzunluğunu list'in uzunluğuna eşitlediğimiz için
        duplicate'te değer almayıp 0 olan değerlerler var. Bu indexlerdeki
        0'ları yazdırmamak için:*/
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}