public class LambdaPractice {


    public static void main(String[] args) {

Movable moveMile = (int mile ) -> {
    System.out.println("moving "+ mile);
};

Movable moveShort = mile -> System.out.println("moving short " + mile);

moveAction(mile -> System.out.println("moving short " + mile));

        System.out.println("**********************");

Measurable m1 = ()-> System.out.println("Measuring Square ");
Measurable m2 = () -> System.out.println("Measuring Rectangle");

Measurable m3 = () -> { System.out.println("Measuring Circle step1 ");
    System.out.println("Measuring Circle step2 ");
    System.out.println("Measuring Circle step3 "); };

    m1.measure();
    m2.measure();
    m3.measure();

        System.out.println("**********************");

        Computable adder = (num1, num2) ->
           System.out.println("adding result " + (num1 + num2));
        Computable multiplying = (num1, num2) ->
                System.out.println("multiplying result " + (num1 * num2));
        Computable dividing = (num1, num2) ->
                System.out.println("adding result " + (num1 / num2));
        Computable subtraction = (num1, num2) ->
                System.out.println("adding result " + (num1 - num2));


        adder.compute(100,25);
        multiplying.compute(100,25);
        dividing.compute(100,25);
        subtraction.compute(100,25);
        System.out.println("**********************");

        Flyable drone = mile ->  mile>10; // we can use also : mile -> {return mile>10;};
        System.out.println(drone.flyHihg(15));
        System.out.println(drone.flyHihg(5));

        Flyable seaPlane = mile -> mile<10 && mile%5==0;
        System.out.println(seaPlane.flyHihg(5));
        System.out.println(seaPlane.flyHihg(18));

    }

    public static void moveAction(Movable movable){
        movable.move(100);

    }





}
@FunctionalInterface
interface Movable{
    void move (int mile);
}
@FunctionalInterface
interface Measurable{
    void measure ();
}
@FunctionalInterface
interface Computable{
    void compute (int num1, int num2);
}
@FunctionalInterface
interface Flyable{
    boolean flyHihg (int mile);
}