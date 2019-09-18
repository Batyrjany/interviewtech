import com.github.javafaker.Faker;

public class Count_char {

    static Count_char charCount = new Count_char();

    public static void main(String[] args) {

        Faker faker = new Faker();

        String str = faker.funnyName().name();
        System.out.println(str);

 charCount.countOfChar(str);


    }

public void countOfChar(String str){

        int dig_count = 0;
        int up_count = 0;
        int low_count = 0;

    for (int i = 0; i < str.length() ; i++) {

        if(Character.isDigit(str.charAt(i))){
            dig_count++;
        }
        if(Character.isUpperCase(str.charAt(i))){
            up_count++;
        }
        if(Character.isLowerCase(str.charAt(i))){
            low_count++;
        }
    }
    System.out.println("Count of digits : " + dig_count);
    System.out.println("Count of UpperCase : " + up_count);
    System.out.println("Count of lowercase : " + low_count);

}






}
