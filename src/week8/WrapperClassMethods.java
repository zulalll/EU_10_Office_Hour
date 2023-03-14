package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClassMethods {
    public static void main(String[] args) {

        two();
        // one();
        //this is autoboxing or boxing
        int a=40;
        Integer b=a;

        //unboxing
        Integer c=50;
        int d=c;

        /*
        1.parseInt():string value turns into int
        2.valueOf():convert a string to an Integer object
        3.toString():take a int/Integer string value(convert it to string object)
        4.Integer.max or min:take max or min value Integer value

         */

        System.out.println(Integer.toString(123).concat("OneTwoThree")); //123

        String str="123house258";
        int total=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                total+=Integer.valueOf(""+str.charAt(i));
            }
        }

        System.out.println(total);
    }
    public static void one(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        String number=scan.nextLine();

        boolean isPositive=false;

        int num =Integer.parseInt(number);
        if(num>=0){
            isPositive=true;
        }
        System.out.println(isPositive);
        scan.close();
    }

    public static void two(){
        String str="456number8745789";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                if(Integer.valueOf(str.charAt(i))%3==0){
                    sum+=Integer.valueOf(""+str.charAt(i));
                }
            }
        }
        System.out.println(sum);






    }
}
