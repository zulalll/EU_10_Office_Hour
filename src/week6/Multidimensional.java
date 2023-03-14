package week6;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {



        int []numbers=new int [5]; //1D
        int [][] numbers2D=new int [5][]; //2D
        int [][][]numbers3D=new int [5][][]; //3D

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers2D));// ?????????? why null!!!!!!!!!!!


        numbers[0]=5;
        numbers2D[0]=new int []{2,3,4};
        System.out.println(Arrays.deepToString(numbers2D));

        int [] element1={1,2,3};
        numbers2D[1]=element1;
        System.out.println(Arrays.toString(numbers2D[0]));







    }
}
