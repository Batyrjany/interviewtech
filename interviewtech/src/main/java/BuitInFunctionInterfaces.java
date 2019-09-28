import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class BuitInFunctionInterfaces {

    public static void main(String[] args) {




        List<String> lst = new ArrayList<>();

        lst.add("Adam");
        lst.add("Johny");
        lst.add("Maryland");
        lst.add("Diana");
        lst.add("Dima");
        lst.add("Alexander");
        lst.add("Jonathan");
        System.out.println(lst);

        List<Integer> lstInt = new ArrayList<>();

        lstInt.add(2);
        lstInt.add(100);
        lstInt.add(45);
        lstInt.add(83);
        lstInt.add(9);
        lstInt.add(11);
        lstInt.add(38);



        System.out.println(lstInt);

        System.out.println("***********Predicate**************");

//        Predicate <String> moreThan5 = name -> name.length()>5;
//        System.out.println(lst.removeIf(moreThan5));
//        System.out.println(lst);

        System.out.println( lst.removeIf(nam->nam.length()<5));
        System.out.println(lst);


        System.out.println("***********Consumer**************");

        Consumer <String>  str = t -> System.out.println(t + " || " + t);
        lst.forEach(str);
        lst.forEach(each -> System.out.println(each+each+each));


        System.out.println("***********Supplier**************");


        Supplier <String> StrSup = () -> new String ("String") ;
        System.out.println(StrSup.get());
        Supplier <Integer> intSup = () -> new Random().nextInt() ;
        System.out.println(intSup.get());
        Supplier <Person> perSup = () -> new Person() ;
        System.out.println(perSup.get());

        System.out.println("***********Function**************");

        Function<String, Integer> lenGet = s -> s.length();


        List<Integer> len = new ArrayList<>();

        for (String name : lst) {

            len.add( lenGet.apply(name));

        }

        System.out.println(len);

//    cs



    }


}
