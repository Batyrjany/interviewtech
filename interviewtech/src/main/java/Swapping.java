public class Swapping {


    public static void main(String[] args) {
        int a=10;
        int b= 20;
        a = a ^ b ^ (b = a);
        System.out.println(a);
        System.out.println(b);


        System.out.println("__________________");


        int c = 30;
        int d = 40;
        d = (c + d) - ( c = d);
        System.out.println(c);
        System.out.println(d);


    }

}
