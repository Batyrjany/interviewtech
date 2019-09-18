import com.github.javafaker.Faker;

import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {

        Faker faker = new Faker();

        String str = faker.funnyName().name();
        str = str.replace(" ", "");
       // str = str.toLowerCase();
        System.out.println(str);


        char [] arr = str.toCharArray();
        int l = arr.length;


        System.out.println(  removeDuplicates(arr,l));



    }

    public static String removeDuplicates(char [] a, int n ){


        int index =0;


        for (int i = 0; i < n; i++) {

            int j ;

            for ( j = 0; j < n; j++) {

                if (a[i] == a[j]) {
                    break;
                }
            }
                if(j==i){

                  a[index++] = a[i];
                }
            }

        return String.valueOf(Arrays.copyOf(a,index));
    }
}
