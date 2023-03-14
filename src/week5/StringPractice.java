package week5;

public class StringPractice {
    public static void main(String[] args) {

        String s1="hat";
        String s2=new String("hat");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2);  //false
        // value,memory location,data type,everything should be same.

        String s3="hat";
        System.out.println(s1==s3); //true

        s3="bag";
        System.out.println(s3);

        //Can you explain why String is immutable?
        //you can not change, when you change value, it is reassigning.

        //trim()leading and trailing spaces will be deleted

        System.out.println("This is a  practice.".replace(" ",""));

        //indexof returns char

        //argument=parameter

        String str="Robert Down Junior";
        String first=str.substring(0,str.indexOf(" "));
        String second=str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
        String result=first.charAt(0)+"."+second.charAt(0)+"."+str.substring(str.lastIndexOf(" ")+1);
        System.out.println(result);
//str.charAt(0)+ "."  +  str.charAt(indexOf(" ")+1, indexOf(" ")+2)  + "."  + str.charAt(lastIndexOf(" ")+1)

        String name="Robert Down Junior";
        String n1=name.substring(0,1).toUpperCase()+"."+name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2)+"."+
                name.substring(name.lastIndexOf(" ")+1);
        System.out.println(n1);// R.D. Junior


    }
}
