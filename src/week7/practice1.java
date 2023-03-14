package week7;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        one();
        two();


    }


    public static void one() {
        String[][] fruits = new String[3][];
        String[] fruit = {"apple", "banana", "pear"};
        String[] price = {"10", "12", "4"};
        String[] count = {"100", "190", "200"};

        fruits[0] = fruit;
        fruits[1] = price;
        fruits[2] = count;

        System.out.println(Arrays.deepToString(fruits));

        for (int i = 0; i < 3; i++) {
            String name = fruits[0][i];
            String price1 = fruits[1][i];
            String count1 = fruits[2][i];

            System.out.println(name + " price is " + price1 + " dollar, " + count1 + " left.");

        }


    }

    public static void two() {
        int[][] table = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};

        int result = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result += table[i][j];
            }
        }

        System.out.println(result);
    }





}
