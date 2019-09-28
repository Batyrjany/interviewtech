import com.github.javafaker.Faker;

import java.sql.SQLOutput;
import java.util.Random;

public class FibonacciDemo {


    static FibonacciDemo fib = new FibonacciDemo();

    public static void main(String[] args) {



        Faker faker = new Faker();

        int f = faker.number().randomDigit();
        System.out.println(f);


        fib.fibonacci(f);
        System.out.println();
        System.out.println("--------------------");

        fib.fibonacci0(f);



    }
    public  void fibonacci(int n){
//           n  = 10 ;
        int n1 = 0 ;
        int n2 = 1 ;
        int n3 ;

        for (int i = 0; i < n; i++) {


            n3 = n1+n2 ;
            System.out.print(n3 + " ");
            n1=n2;
            n2=n3;

        }
    }

    public  void fibonacci0(int n){
//           n  = 10 ;
        int n1 = 0 ;
        int n2 = 1 ;
        int n3 ;

        for (int i = 0; i < n; i++) {

            System.out.print(n1 + " ");

            n3 = n1+n2 ;
            n1=n2;
            n2=n3;

        }
    }

}
