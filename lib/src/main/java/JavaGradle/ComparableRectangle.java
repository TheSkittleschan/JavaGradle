package JavaGradle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
    //Construct a ComparableRectangle with specified properties
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    //Implement the compareTo method defined in Comparable
    @Override
    public int compareTo (ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    //Implement the toString method in GeometricObject
    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
