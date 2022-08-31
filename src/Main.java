import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ///Задача №1,2,3
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int k : arr) {
            sum += k;
        }
        System.out.println("1. Сумма трат за месяц составила " + sum + " рублей.");

        int min = arr[0];
        int max = arr[0];
        for (int k : arr) {
            if (min > k) {
                min = k;
            } else if (max < k) {
                max = k;
            }
        }
        System.out.printf("2. Минимальная сумма трат за день составила %s рублей.\n" + "Максимальная сумма трат за день составила %s рублей.\n", min, max);

        double divSum = (double) sum / arr.length;
        String average = String.format("%.2f", divSum);

        System.out.println("3. Средняя сумма трат за месяц составила " + average + " рублей.");

        ///Задача №4
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }
}













