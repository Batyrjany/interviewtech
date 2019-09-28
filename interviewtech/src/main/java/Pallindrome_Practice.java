import com.github.javafaker.Faker;

import java.util.Objects;

public class Pallindrome_Practice {


    public static void main(String[] args) {

        String str = "racecar";
        //String str = "rbcecar";



        System.out.println("____________PALLINDROME______________");

        System.out.println(reverseStringWithStringBuilder(str)+   " reverseStringWithStringBuilder");
        System.out.println(reverseStringWithStringBuffer(str)+ " reverseStringWithStringBuffer");
        System.out.println(reverseStringUsingLoop(str)+" reverseStringUsingLoop");
        System.out.println(reverseStringAndNotWord(str)+ " reverseStringAndNotWord");
        System.out.println(reverseStringAndEachWord(str)+ " reverseStringAndEachWord");


    }
    public static boolean reverseStringWithStringBuilder(String str) {
        StringBuilder strb = new StringBuilder(str).reverse();


        return str.toString().equals(str);

    }

    public static boolean reverseStringWithStringBuffer(String str) {
        StringBuilder strf = new StringBuilder(str).reverse();


        return strf.toString().equals(str);

    }

    public static boolean reverseStringUsingLoop(String str) {
        String  reversed = "";

        for (int i = str.length()-1; i>=0 ; i--) {

            reversed+=str.charAt(i);

        }


        return reversed.equals(str);

    }


    public static boolean reverseStringAndNotWord(String str) {
        String  rev = "";
        String [] arr = str.split(" ");


        for (int i = arr.length-1; i>=0 ; i--) {


            rev += arr[i] + " ";


        }


        return rev.trim().equals(str);

    }


    public static boolean reverseStringAndEachWord(String str) {
        String  rev = "";
        String [] arr = str.split(" ");

        for (int i = 0; i< arr.length ; i++) {
            String r= arr[i]+" ";
            for (int j=r.length()-1; j>=0 ; j--) {
                rev+=r.charAt(j);

            }
        }
        return rev.trim().equals(str);
    }








}
