package week6;

public class ForeachLoop {
    public static void main(String[] args) {

         //create email address for each name

        String[] arr = {"Harold", "Jack", "Ahmet", "Sakushi"};

        for (String each : arr) {
            System.out.println(each + "@gmail.com");
        }

        String[] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
        int total=0;
        for (String each : names) {
            total+=Integer.valueOf(each.substring(each.length()-4));
        }
        System.out.println(total);

    }
}
