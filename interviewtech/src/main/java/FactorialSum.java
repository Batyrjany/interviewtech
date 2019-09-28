import com.github.javafaker.Faker;

public class FactorialSum {


    public static void main(String[] args) {

        Faker faker = new Faker();

        int num = faker.number().randomDigitNotZero();
        System.out.println(num);

        System.out.println(facttorialNum(num));
    }

    public static Long facttorialNum(int n) {

        Long facttorialSum = 1L;


        if (n == 0) {
          return 0l;
        } else {
            for (int i = 1; i <= n; i++) {

                facttorialSum = facttorialSum * i;

            }

            return facttorialSum;
        }
    }
    }