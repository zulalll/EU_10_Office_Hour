package week6;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

        // input a number, use 3 number smaller or equal to that number,
        // make combination that sum of that 3 number is equal to the number you input.
        // 2 --> 6
    /*
002
011
020
101
110
200
     */
        // 3 --> 10
        // 5 --> 21
/*
    Scanner input=new Scanner (System.in);;
    int number=input.nextInt();
    int total=0;
            for (int i = 0; i <=number ; i++) {
                for (int j = 0; j <=number ; j++) {
                    for (int k = 0; k <=number ; k++) {
                        if(i+j+k==number){
                            System.out.println(""+i+j+k);
                            total++;
                        }
                    }
                }
            }

            System.out.println(total);
            input.close();

 */

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }






        }











    }



