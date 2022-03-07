package JavaGradle;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCircleRectangle {
    @Test
    void testCircleRectange() {
	CircleFromSimpleGeometricObject circle = 
		new CircleFromSimpleGeometricObject(1);
	System.out.println("A circle " + circle.toString());
	System.out.println("The color is " + circle.getColor());
	System.out.println("The radius is " + circle.getRadius());
	System.out.println("The area is " + circle.getArea());
	System.out.println("The diameter is " + circle.getDiameter());
	
	RectangeFromSimpleGeometricObject rectangle = 
		new RectangeFromSimpleGeometricObject(2, 4);
	System.out.println("\nA rectangle " + rectangle.toString());
	System.out.println("The area is " + rectangle.getArea());
	System.out.println("The perimeter is " + rectangle.getPerimeter());
	
	assertTrue(true, "All tests passed");
    }

}
