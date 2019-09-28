
import java.util.*;

public class IteratorCollection {

    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>(Arrays.asList(3, 4, 5, 7, 9, 23, 56, 89, 32, 64, 86, 44, 53, 47));
        System.out.println(coll);
        Iterator<Integer> myIterartor = coll.iterator();

        while (myIterartor.hasNext()) {

            if (myIterartor.next() > 50) {

                myIterartor.remove();
            }
        }
        System.out.println(coll);
        System.out.println("*******************************");

        List<Double> mylist = new ArrayList<>(Arrays.asList(4.34, 6.9, 10.0, 12.12, 54.67, 89.34, 45.00));
        System.out.println(mylist);

        ListIterator<Double> lstIter = mylist.listIterator();
        System.out.println(lstIter.hasNext());
        System.out.println(lstIter.nextIndex());


        while (lstIter.hasNext()) {
            Double item = lstIter.next();
            System.out.println(" | item is " + item);

            if (item < 10.00) {
                lstIter.remove();
            }

        }
        System.out.println("item<10.00 -->>" + mylist);

        System.out.println("lstIter.hasPrevious()   " + lstIter.hasPrevious());
//        System.out.println("lstIter.previousIndex()   "+lstIter.previousIndex());
//        System.out.println("lstIter.previous()   "+lstIter.previous());


        System.out.println("*************************");


        while (lstIter.hasPrevious()) {
            System.out.println("lstIter.previousIndex()   " + lstIter.previousIndex());
            Double item1 = lstIter.previous();
            System.out.print(" | item   " + item1 + " ");

            if (item1 <50.0) {

                //lstIter.remove();
                 //lstIter.set(200.0);
                 lstIter.add(10000D);

            }

        }
        System.out.println("\n"+"item1 >50.0  "+mylist);
    }
}
