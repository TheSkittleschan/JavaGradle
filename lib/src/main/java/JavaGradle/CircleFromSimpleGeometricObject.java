package JavaGradle;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;
    
    public CircleFromSimpleGeometricObject() {
	
    }
    
    public CircleFromSimpleGeometricObject(double radius) {
	this.radius = radius;
    }
    
    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
	super(color, filled);
	this.radius = radius;
    }
    
    //Return radius
    public double getRadius() {
	return radius;
    }
    
    //Set new radius
    public void setRadius(double radius) {
	this.radius = radius;
    }
    
    //Return area
    public double getArea() {
	return radius * radius * Math.PI;
    }
    
    //Return diameter
    public double getDiameter() {
	return 2 * radius;
    }
    
    //Return perimeter
    public double getPerimeter() {
	return 2 * radius * Math.PI;
    }
    
    //Print the circle info
    public void printCircle() {
	System.out.println("The circle created "+ getDateCreated() + 
		" and the radius is " + radius);
    }
    
    @Override
    public String toString() {
	return super.toString() + "\nradius is " + radius;
    }
    
}
