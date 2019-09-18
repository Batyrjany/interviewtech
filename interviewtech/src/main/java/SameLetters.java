import java.util.Arrays;

public class SameLetters {



    public static void main(String[] args) {

        System.out.println(same("Abc", "bCa"));
        System.out.println(same("abc", "acg"));


    }


    public static boolean same(String a, String b){

        if(a==null){
            return b==null;
        } else if(b==null){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] left = a.toCharArray();
        char[] right = b.toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);

        boolean same =  Arrays.equals(left,right);


        return  same;

    }


}
