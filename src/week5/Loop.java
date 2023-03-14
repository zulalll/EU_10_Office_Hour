package week5;

public class Loop {
    public static void main(String[] args) {

        int num = 2;
        String result = "";
        for (int i = 1; i < 11; i++) {
            result += i * num + " ";
        }

        System.out.println(result);

        int number = 5;
        int multiplication = 0;

        for (int i = 1; i <= 10; i++) {
            multiplication = number * i;
            System.out.println(number + "x" + i + "=" + multiplication);
        }


        //It should then print the multiplication table of that number
        //natural numbers does not start from 0,it starts with 1.



        String result1 = "";
        for (int j = 1; j <= 5; j++) {
            System.out.println("*".repeat(j));

        }

        System.out.println("--------------------------");

        String result2 = "";
        for (int i = 0; i < 5; i++) {
            result2 += "*";
            System.out.println(result2);
        }


    }
}
