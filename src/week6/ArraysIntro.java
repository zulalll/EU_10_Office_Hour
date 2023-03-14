package week6;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        //Array can hold multiple values
        //but variable can hold only one.
        //right part for assigning,left part for creating.

        boolean[] isSunny = new boolean[7];
        boolean[] isSunnyAnkara = {true, false, true, false, true, false, true}; //for weekly weather report.
        System.out.println(Arrays.toString(isSunny)); //[false, false, false, false, false, false, false]

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even = 0;
        int odd = 0;
        for (int each : numbers) {
            if (each % 2 == 0) {
                even += each;
            } else {
                odd += each;

            }
        }
        System.out.println(even);
        System.out.println(odd);

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversed = new int[numbers1.length];

        for (int i = numbers1.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers1[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}