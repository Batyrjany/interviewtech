import com.github.javafaker.Faker;

public class StringReverse_Practice {


    public static void main(String[] args) {
        Faker faker = new Faker();

        String str = faker.funnyName().name();
       // str = str.replace(" ", "");
        // str = str.toLowerCase();
        System.out.println(str);


        System.out.println(reverseStringWithStringBuilder(str)+   " reverseStringWithStringBuilder");
        System.out.println(reverseStringWithStringBuffer(str)+ " reverseStringWithStringBuffer");
        System.out.println(reverseStringUsingLoop(str)+" reverseStringUsingLoop");
        System.out.println(reverseStringAndNotWord(str)+ " reverseStringAndNotWord");
        System.out.println(reverseStringAndEachWord(str)+ " reverseStringAndEachWord");


    }

    public static String reverseStringWithStringBuilder(String str) {
        StringBuilder strb = new StringBuilder(str).reverse();


        return strb.toString();

    }

    public static String reverseStringWithStringBuffer(String str) {
        StringBuilder strf = new StringBuilder(str).reverse();


        return strf.toString();

    }

    public static String reverseStringUsingLoop(String str) {
         String  reversed = "";

        for (int i = str.length()-1; i>=0 ; i--) {

            reversed+=str.charAt(i);

        }


        return reversed;

    }


    public static String reverseStringAndNotWord(String str) {
        String  rev = "";
        String [] arr = str.split(" ");


        for (int i = arr.length-1; i>=0 ; i--) {


                rev += arr[i] + " ";


        }


        return rev;

    }


    public static String reverseStringAndEachWord(String str) {
        String  rev = "";
        String [] arr = str.split(" ");

        for (int i = 0; i< arr.length ; i++) {
            String r= arr[i]+" ";
            for (int j=r.length()-1; j>=0 ; j--) {
                rev+=r.charAt(j);

            }
        }
        return rev.trim();
    }










}
