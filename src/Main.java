import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

    ///Задача №1,2,3
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int num1 = arr[0] / arr.length;
            int num2 = arr[2] / arr.length;
            int divSum = sum / arr.length;
            if (sum > 0) {

                Collections.shuffle(Arrays.asList(arr));
                /// System.out.println(Arrays.toString(arr) + " ");
                System.out.println("1. Сумма трат за месяц составила " + sum + " рублей.");

                if (num1 != 0 && num2 != 0) {

                    System.out.println("2. Максимальная сумма трат за день составила " + Math.max(num1, num2) + " рублей. Минимальная сумма трат за день составила " + Math.min(num1, num2) + " рублей.");
                    System.out.println("3. Средняя сумма трат за месяц составила " + divSum + " рублей.");

                    ///Задача №4
                    char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                    for (int j = reverseFullName.length - 1; j >= 0; j--) {
                        System.out.print(reverseFullName[j]);
                    }
                    break;
                }
            }
        }
    }
    public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] array = new int[30];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100_000) + 100_000;
            }
            return array;
        }
    }











