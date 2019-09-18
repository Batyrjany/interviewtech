import com.github.javafaker.Faker;

import java.util.Arrays;

public class Mod {

    public static void main(String[] args) {


        Faker faker = new Faker();

       int f = (int)faker.number().numberBetween(1,30);
        System.out.println(f);

        finra(f);


    }

    public static void finra(int n) {


        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }


        }
    }
}
