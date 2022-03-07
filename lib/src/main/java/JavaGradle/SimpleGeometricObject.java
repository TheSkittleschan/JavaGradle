package JavaGradle;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    //Construct default geometric object
    public SimpleGeometricObject() {
	dateCreated = new java.util.Date();
	
    }
    
    //Construct a geometric object with the specified color and filled value
    public SimpleGeometricObject(String color, boolean filled) {
	dateCreated = new Date();
	this.color = color;
	this.filled = filled;
    }
    
    //Return color
    public String getColor() {
	return color;
    }
    
    //Set a new color
    public void setColor(String color) {
	this.color = color;
    }
    
    //Return filled
    public boolean isFilled() {
	return filled;
    }
    
    //Set new filled
    public void setFilled(boolean filled) {
	this.filled = filled;
    }
    
    //Get date created
    public Date getDateCreated(){
	return dateCreated;
    }
    
    //Return a string representation of this object
    public String toString() {
	return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    
}
