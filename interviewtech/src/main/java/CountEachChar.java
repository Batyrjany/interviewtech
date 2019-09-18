import com.github.javafaker.Faker;

import java.util.HashMap;

public class CountEachChar {


    public static void main(String[] args) {

        Faker faker = new Faker();

        String str = faker.funnyName().name();
        str = str.replace(" ", "");
        // str = str.toLowerCase();
        System.out.println(str);


        charCount(str);



    }

    public static void charCount(String a){

        char [] arr = a.toCharArray();

        HashMap<Character,Integer>  charCountMap = new HashMap<>();

        for (char ch : arr){

            if(charCountMap.containsKey(ch)){
                charCountMap.put(ch,charCountMap.get(ch)+1);
            }
            else{
                charCountMap.put(ch,1);
            }
        }
        System.out.println(a + " : " +charCountMap);
    }


}
