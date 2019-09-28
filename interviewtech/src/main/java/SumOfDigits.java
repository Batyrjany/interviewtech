import com.github.javafaker.Faker;

import javax.crypto.spec.PSource;

public class SumOfDigits {


    public static void main(String[] args) {



    Faker faker = new Faker();

   Long num = faker.number().randomNumber();
          System.out.println(num);

           System.out.println(sumOfDigits(num));
}

public static Long sumOfDigits(Long num){

    Long sum = 0L;

    while(num>0){
        sum+=num%10;
        num= num/10;

    }

    return sum;
}





}
