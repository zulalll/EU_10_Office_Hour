package Week2;

public class A_Variables {
    public static void main(String[] args) {

        byte number = 12;
        byte number1 = -32;

        byte wrongNumber = (byte) 65200;

        short number2 = 32000;
        short number3 = 5;

        int number4 = 15201458;

        long number5 = 1520000000000000000L; //because default value is int

       // int number6 = 3.1; //=>compile error //for decimals we cant use whole number variable types.

        long number7 = 100; //no need l because it is range of int.

        double number8=3.2568;

        char letter1='q'; //chars' biggest range is 65.535

        double tax=0.15;
        double johnSalary=10000-(10000*tax);
        double watsonSalary=7000-(7000*tax);
        double mikeSalary=12000-(12000*tax);

        System.out.println("johnSalary = " + johnSalary);
        System.out.println("watsonSalary = " + watsonSalary);
        System.out.println("mikeSalary = " + mikeSalary);

       int NumberOfEmployee=10;
         // it is not wrong,but lowercase preferred one.
        //this is a kind of java rule.





    }
}
