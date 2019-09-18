import com.github.javafaker.Faker;
import org.openqa.selenium.json.JsonOutput;

import java.util.HashSet;
import java.util.Set;

public class UniqueLetters {


    public static void main(String[] args) {

        Faker faker = new Faker();

        String str = faker.funnyName().name();
        str = str.replace(" ", "");
        str = str.toLowerCase();
        System.out.println(str);


        printUniqueLettes(str);


    }

    public static void printUniqueLettes(String a) {

        char[] arr = a.toCharArray();

        Set<Character> unique = new HashSet<>();

        for (char ch : arr) {
            unique.add(ch);
        }
        String mod = unique.toString();

        System.out.println(mod);
    }


}