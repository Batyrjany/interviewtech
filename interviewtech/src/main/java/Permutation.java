import com.github.javafaker.Faker;

import java.sql.SQLOutput;

public class Permutation {


    public static void main(String[] args) {
        Faker faker = new Faker();

        String str = faker.name().firstName().replace(" ", "").toLowerCase();

       // System.out.println(str);

        String str1 = "ABC";

        printPermutation(str1, "");

    }


    public static void printPermutation(String str, String per){
           int count=0;
        if (str.isEmpty()) {
            System.out.println(per+ " ");

            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String sub = str.substring(0,i).concat(str.substring(i+1));

            printPermutation(sub, per+ch);

            if(sub.isEmpty()){

            }

        }


    }

}
