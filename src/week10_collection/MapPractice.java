package week10_collection;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        one();

    }

    public static void one(){
        //
        Map<String ,Object> fruits=new HashMap<>(); //this Object will be received anything,value can be different value types.
        fruits.put("apple",7);
        fruits.put("banana",5);
        fruits.put("grape",2.5);
        fruits.put("orange",fruits);


        System.out.println("fruits = " + fruits);
        System.out.println("fruits.get(\"grape\") = " + fruits.get("grape"));
        System.out.println("fruits.size() = " + fruits.size());

        System.out.println("fruits.values() = " + fruits.values());
        System.out.println("fruits.keySet() = " + fruits.keySet());

        /*
        for (String key : fruits.keySet()) {
            System.out.println(fruits.get(key));
        }

         */

        for (Object value : fruits.values()) {
            System.out.print(value+" ");
        }

        System.out.println();

       // fruits.clear();
        System.out.println("fruits = " + fruits);

        System.out.println("fruits.containsKey(\"banana\") = " + fruits.containsKey("banana"));
        System.out.println("fruits.containsValue(10) = " + fruits.containsValue(10));


    }
}
