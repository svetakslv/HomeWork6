import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        ///Задача №1
        Random random = new Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ///if (i == arr.length - 1) {
            ///arr[i] = random.nextInt(100_000) + 100_000;
            arr[0] = random.nextInt(100_000) + 100_000;
            arr[1] = random.nextInt(100_000) + 100_000;
            arr[2] = random.nextInt(100_000) + 100_000;
            arr[3] = random.nextInt(100_000) + 100_000;
            arr[4] = random.nextInt(100_000) + 100_000;
            arr[5] = random.nextInt(100_000) + 100_000;
            arr[6] = random.nextInt(100_000) + 100_000;
            arr[7] = random.nextInt(100_000) + 100_000;
            arr[8] = random.nextInt(100_000) + 100_000;
            arr[9] = random.nextInt(100_000) + 100_000;
            arr[10] = random.nextInt(100_000) + 100_000;
            arr[11] = random.nextInt(100_000) + 100_000;
            arr[12] = random.nextInt(100_000) + 100_000;
            arr[13] = random.nextInt(100_000) + 100_000;
            arr[14] = random.nextInt(100_000) + 100_000;
            arr[15] = random.nextInt(100_000) + 100_000;
            arr[16] = random.nextInt(100_000) + 100_000;
            arr[17] = random.nextInt(100_000) + 100_000;
            arr[18] = random.nextInt(100_000) + 100_000;
            arr[19] = random.nextInt(100_000) + 100_000;
            arr[20] = random.nextInt(100_000) + 100_000;
            arr[21] = random.nextInt(100_000) + 100_000;
            arr[22] = random.nextInt(100_000) + 100_000;
            arr[23] = random.nextInt(100_000) + 100_000;
            arr[24] = random.nextInt(100_000) + 100_000;
            arr[25] = random.nextInt(100_000) + 100_000;
            arr[26] = random.nextInt(100_000) + 100_000;
            arr[27] = random.nextInt(100_000) + 100_000;
            arr[28] = random.nextInt(100_000) + 100_000;
            arr[29] = random.nextInt(100_000) + 100_000;
        }


        Collections.shuffle(Arrays.asList(arr));
        /// System.out.println(Arrays.toString(arr) + " ");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

    }
}










