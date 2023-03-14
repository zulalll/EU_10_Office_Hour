package week6;

public class Practices {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(9-i*2+1)+String.valueOf(i+1).repeat(i*2+1));


        }

/*        1
        222
      33333
    4444444
  555555555

 */

        String str="home";
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);

        int count = 1;
        while (count <= 10) {
            count *= 2;
        }
        count = count - 10;  // 16-10 = 6
        System.out.println("count = " + count);

        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.print(" " + i);
            i++;
        } while (i < 11);
    }
// 2 4 6 8 10






























    }

