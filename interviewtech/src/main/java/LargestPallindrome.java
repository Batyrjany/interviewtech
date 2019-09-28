import com.github.javafaker.Faker;

public class LargestPallindrome {

    public static void main(String[] args) {


        String str = "Mom and dad in a racecar";

        str = str.toLowerCase();
        System.out.println(str);

        System.out.println(isLargestPallindrome(str));

    }


    public static String isLargestPallindrome(String str) {
   String XLPallindrome ="";
   String [] arr = str.split(" ");

        for ( String s: arr) {
            String rev = "";
            for (int i = s.length()-1; i >=0 ; i--) {
                rev+=s.charAt(i);
            }
        if(s.equals(rev) && XLPallindrome.length()<s.length())   {
            XLPallindrome=s;
        }
        }

        return XLPallindrome;
    }
}