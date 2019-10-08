import java.util.Scanner;

public class DistanceCalculator {

private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {


        Distance dist1 = new DistanceImplementation();
        Distance dist2 = new DistanceImplementation();

        int feet1 = 3;
        float inches1 = (float) 4.1;

        int feet2 = 3;
        float inches2 = (float) 4.1;

        dist1.setFeetAndInches(feet1, inches1);
        dist2.setFeetAndInches(feet2, inches2);

        System.out.println(dist1.getDistanceComparison(dist2));

    }
}

abstract class Distance {

    protected int feet;
    protected float inches;

    abstract public void setFeetAndInches(int feet, float inches);

    abstract public int getFeet();

    abstract public float getInches();

    abstract String getDistanceComparison(Distance dist2);

}

class DistanceImplementation extends Distance {


    @Override
    public void setFeetAndInches(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    @Override
    public int getFeet() {
        return this.feet;
    }

    @Override
    public float getInches() {
        return this.inches;
    }

    @Override
    String getDistanceComparison(Distance dist2) {

        int distanceA=this.getFeet();
        int distanceB=dist2.getFeet();
        if(distanceA > distanceB)
            return "First is greater";
        else if(distanceA < distanceB)
            return "Second is greater";
        else

        return "Both are equal";
    }
}