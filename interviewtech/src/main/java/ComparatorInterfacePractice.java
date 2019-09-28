import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacePractice {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

//        lst.add("Adam");
//        lst.add("John");
//        lst.add("Mary");
//        lst.add("Diana");
//        System.out.println(lst);
//        Collections.sort(lst);
//        System.out.println(lst);


        List<Person> plst = new ArrayList<>();
        plst.add(new Person());
        plst.add(new Person());
        plst.add(new Person());
        plst.add(new Person());
        System.out.println(plst);
        Collections.sort(plst);

        System.out.println(plst);

        Comparator<Person> comparator = new PersonNameComparator();
        Collections.sort(plst,comparator);

        Comparator<Person> ageComparator =
                Comparator.comparing(p -> p.age);
        Collections.sort(plst,ageComparator);
        System.out.println(plst);


        Comparator<Person> nameReverseComparator =
                ( o1,  o2) ->  o2.name.compareTo(o1.name);
        Collections.sort(plst,nameReverseComparator);
        System.out.println(plst);

Comparator<Person> nameRThenAgeComp=
        nameReverseComparator.thenComparing(ageComparator.reversed());
        Collections.sort(plst,nameRThenAgeComp);
        System.out.println(plst);


    }
    }
class PersonNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {



        return o1.name.compareTo(o2.name);
    }
}




