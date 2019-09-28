import com.github.javafaker.Faker;

public class ReverseNum {

    public static void main(String[] args) {
        Faker faker = new Faker();
                int num = faker.number().numberBetween(100,10000);
        System.out.println(num);
        System.out.println(returnReverseNum(num));
    }


    public static int returnReverseNum(int num){
        int reverse=0;
        int rem = 0;

        do{
            rem = num%10;
            reverse = reverse * 10 + rem;
            num = num/10;
        }while(num>0);

        return reverse;
    }
}
