public class Main {
    public static void main(String[] args) {
        // n (eleman sayısı) / elemanların harmonik serisi
        int[] numbers = {4,5,3,8,18,25};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += 1.0/numbers[i];
        }
        double harmonikOrt = numbers.length/sum;
        System.out.println("Harmonik ortalama = " + harmonikOrt);
    }
}