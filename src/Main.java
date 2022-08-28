import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        ///  int[] arr = new int[30];
        ///  int sum = 0;
        ///  java.util.Random random = new java.util.Random();
        ///  arr[sum] = random.nextInt(100_000) + 100_000;
        /// for (int element : arr) {
        ///         sum += element;
        ///      System.out.println(sum);

        ///Задача №1
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100_000) + 100_000;
          ///  for (int index = 0; index < arr.length; index++) {
           ///     arr[index] = index + 1;
            ///    System.out.print(arr[index] + " ");

                Collections.shuffle(Arrays.asList(arr));
                System.out.print(Arrays.toString(arr) + " ");

            }
        }
    }







