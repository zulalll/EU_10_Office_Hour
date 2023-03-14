package week7;

import java.time.LocalDate;

public class CustomMethods {
    public static void main(String[] args) {

        String str = "i  f d d s g h r d  c";

        System.out.println(countSpaces(str));

        calculate(100,2.5,5);

        String str1=returnData();
        System.out.println(str1);

    }

    public static int countSpaces(String str) {

        int countSpaces = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countSpaces++;
            }
        }

        return countSpaces;

    }

    public static void calculate(int amount,double rate,int year){

        for (int i = 0; i < year; i++) {
            amount+=amount*rate;

        }
        System.out.println(amount);
    }


    public static String returnData(){
        return "Return data";
    }

    public static boolean leapYear(int year){
        boolean result=false;
        if(year%4==0){
            result=true;
        }
        return result;
    }









}
