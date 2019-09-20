import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatedInteger {


    public static void main(String[] args) {


        Faker faker = new Faker();
        int f = (int)faker.number().numberBetween(10000,100000000);
        System.out.println(f);
//        String str = String.valueOf(f);
//        System.out.println(str);
        findDuplicatedInteger(f);

    }





    public static void findDuplicatedInteger(int n) {

        String str = String.valueOf(n);
         char[] ch = str.toCharArray();

         int l= ch.length;
         int count =0;
      Set<Character> characters = new HashSet<>();
        for (int i = 0; i < l-1; i++) {
            for (int j = 0; j <l-1 ; j++) {

                if(i!=j) {
                    if (ch[i] == ch[j]) {
                        count++;
                        characters.add(ch[i]);
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(characters);

    }
}

