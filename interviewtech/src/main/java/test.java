import java.util.ArrayList;
import java.util.List;

public class test {

    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> oddnums = new ArrayList<>();
        int len = r-l;
        for(int i =l ; i<=r; i++) {

                if (i % 2 != 0) {
                    oddnums.add(i);



            }


        }
    return oddnums;
    }

    public static void main(String[] args) {


        System.out.println(oddNumbers(5, 10));
    }
}

