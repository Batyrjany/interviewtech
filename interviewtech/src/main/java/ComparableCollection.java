import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableCollection {


    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();

        lst.add("Adam");
        lst.add("John");
        lst.add("Mary");
        lst.add("Diana");
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);


        List<Person> plst = new ArrayList<>();
        plst.add(new Person());
        plst.add(new Person());
        plst.add(new Person());
        plst.add(new Person());
        System.out.println(plst);
        Collections.sort(plst);
        System.out.println(plst);



    }




}



class Person implements Comparable<Person> {


    String name;
    int age;

    public Person() {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age
                ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {

        return (this.name.compareTo(o.name)==0) ? Integer.compare(this.age,o.age)
                : this.name.compareTo(o.name);


//        if (this.name.charAt(0) > o.name.charAt(0)) {
//            return 1;
//
//        } else if (this.name.charAt(0) == o.name.charAt(0)) {
//
//            if (this.age > o.age) {
//                return 1;
//            } else if (this.age == o.age) {
//                return 0;
//            } else {
//                return -1;
//            }
//
//        }else{
//        return -1;
//         }
//}

    }
}