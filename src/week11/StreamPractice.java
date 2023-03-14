package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    static List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 8, 8, 8, 4, 4, 2, 2, 9, 0));

    public static void main(String[] args) {
//        one();
//        two();
//        three();
//        four();
          five();
    }


    public static void one() {
        System.out.println(nums.stream().distinct().collect(Collectors.toList())); //distinct() it removes duplicated ones.
    }

    public static void two() {
        System.out.println(nums.stream().skip(5).collect(Collectors.toList())); //skip() it skips first five elements
        System.out.println(nums.stream().limit(8).collect(Collectors.toList())); //limit () it turns first 8 element.
        System.out.println(nums.stream().count()); //17
    }

    public static void three() {
        nums.stream().forEach(n -> System.out.println(n)); //for each (), it uses consumer,Performs an action for each element of this stream.
        System.out.println(nums.stream().allMatch(n -> n >= 5)); //false =>Returns whether all elements of this stream match the provided predicate.
        System.out.println(nums.stream().allMatch(n -> n >= 0)); // true
    }

    public static void four() {
        System.out.println(nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
        //return matching elements with condition
    }

    public static void five() {
        System.out.println(nums);
        System.out.println(nums.stream().map(n -> n * n).collect(Collectors.toList()));
        //Returns a stream consisting of the results of applying the given function to the elements of this stream.
    }


}
