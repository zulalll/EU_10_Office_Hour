package week6;

import java.util.Scanner;

public class Practices2 {
    public static void main(String[] args) {


        for (int i = 1; i < 50; i++) {
            if (i % 5 != 0) {
                continue;
            }

            System.out.println(i);

        }
//5 10 15 20 25 30 35 40 45

        String str = "Wooden Spoon";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.print(str.charAt(i) + " ");
            } else {
                continue;
            }
        }

/* String data = "";
        String str="abcdefghijklmnopqrstuvwxyz";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='u'||ch=='i'||ch=='o'){
                result+=ch;            }
        }
        System.out.println(result);

 */
        String password = "12345";
        Scanner scannner = new Scanner(System.in);
        int guessNumber = 0;
        while (true) {
            System.out.println("Please enter your password.");
            String guess = scannner.nextLine();
            if (guess.equals(password)) {
                System.out.println("Welcome to dasboard");
                break;
            }
            guessNumber++;
            if (guessNumber == 3) {
                System.out.println("Locked.");
                break;
            }
        }

        scannner.close();


        //multiplication table
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }


    }
}

