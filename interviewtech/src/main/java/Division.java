import com.github.javafaker.Faker;

public class Division {


    public static void main(String[] args) {

        Faker faker = new Faker();
        int num = faker.number().randomDigit();
        int num1 = faker.number().randomDigit();
        System.out.println(num);
        System.out.println(num1);

        System.out.println(division(num,num1));
    }


    public static String division(int divident, int divisor){
        int quotuient=0;
        int remainder =0 ;


        while (divident>divisor){

            divident-=divisor;
            quotuient++;
            remainder=divident;

        }

      return "quotuient : "+quotuient+" and "+ " remainder : "+ remainder ;

    }
}
