import com.github.javafaker.Faker;
import org.openqa.selenium.json.JsonOutput;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindMaxCountOfChar {

    public static void main(String[] args) {

        Faker faker = new Faker();

        String str = faker.funnyName().name();
        str = str.replace(" ", "");
        // str = str.toLowerCase();
        System.out.println(str);


        charCount(str);


    }

    public static void charCount(String a) {


        char[] arr = a.toCharArray();
        int max = 0;
        int count = 0;
        char ch = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

                if (max < count) {
                    max = count;
                    ch = arr[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(ch);

    }


}
