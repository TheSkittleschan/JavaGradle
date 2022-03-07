package JavaGradle;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TestGeometricObject {
    
    @Test
    public void testAllMethods() {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5,3);
        boolean isEqualArea = equalArea(geoObject1, geoObject2);

        System.out.println("The two objects have the same area? " + 
        equalArea(geoObject1, geoObject2));
          assertFalse(isEqualArea);

        //Display Circle
        displayGeometricObject(geoObject1);

        //Display rectangle
        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    //A method for displaying a geometric object
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The  area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
