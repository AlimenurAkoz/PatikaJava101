import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();
        int[] list = new int[n];
        int temp;

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++){
            System.out.print((i+1) + ". eleman: ");
            int number = input.nextInt();
            list[i] = number;
        }


        //Sıralama
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        //Sıralanmış halini yazdırma
        System.out.print("Sıralama: ");
        for (int num : list){
            System.out.print(num + " ");
        }
    }
}