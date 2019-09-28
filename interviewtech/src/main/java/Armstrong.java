import com.github.javafaker.Faker;

public class Armstrong {


    public static void main(String[] args) {
        Faker faker = new Faker();

        int num = faker.number().numberBetween(100,999);
        System.out.println(num);

        armstrongOf( num);
        //armstrongOf( 370); //armstrong true;

    }


    public static void armstrongOf(int num){

        int sum = 0;
        int digit = 0;
        int temp = num;

        while(temp>0) {
            digit = temp % 10;
            sum += digit * digit * digit;
            temp = temp / 10;

        }
            if(num==sum){
                System.out.println("armstrong");
            }else{
                System.out.println( "try again");
            }
        }
    }

