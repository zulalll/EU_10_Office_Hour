package week11;

import java.util.function.*;

public class Test {

    public static void main(String[] args) {

        TestFunctionalInterface findSquare=(n)->{

            return n*n;
        };    //this is how we use functional interface, it is kind of overriding.

        System.out.println( findSquare.apply(5));

        one();
        two();
        three();
        four();
        five();
        six();
        seven();


    }

    public static void one(){

        Predicate<Integer> canVote=(n)->{  //it should be non-primitive type
            if(n>=18){
                return true;
            }return  false;
        };

        System.out.println("canVote.test(20) = " + canVote.test(20));


    }

    /* It is same too, and easier to read

    public static void canVote(int n){
        if(n>=18){
            System.out.println("You can vote.");
        }else{
            System.out.println("You can not vote.");
        }
    }

     */

    public static void two(){

        Consumer<String> printName=(name) -> {
            System.out.println("The user is called "+name);
        };

        printName.accept("John");
    }


    public static void three(){

        Function<Integer,String> printAge=(age)->{ //first arg data we need to write, second is return type.
           String result=("The user is "+age+" years old.");
           return result;
        };

        System.out.println(printAge.apply(18));
    }

    public static void four(){
        BiPredicate<String,String> longestStr=(str1,str2)->{
            if(str1.length()>=str2.length()){
                return true;
            }return false;
        };

        System.out.println(longestStr.test("house", "home"));

    }

    public static void five(){
        BiConsumer<String,String> login=(username,password)->{
            System.out.println("Please enter your "+username+" and "+password);
        };
        login.accept("abc.com","abc123");
    }

    public static void six(){
        BiFunction<Double,Double,Double> actualPrice=(price,discount)->{
           Double finalPrice=price*(1-discount);
           return finalPrice;
        } ;
        System.out.println(actualPrice.apply(10.0, 0.1));
    }

    public static void seven(){
        BiFunction<String, String, String> email = (name, mail) -> {
            return name + "@" + mail;
        };

        System.out.println(email.apply("zulpikar", "gmail.com"));
    }



}
