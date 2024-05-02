package simpleTest;

import org.example.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testTritypEquilateral() {
        Triangle triangle = new Triangle(3, 3, 3);
        assertEquals(3, triangle.trityp());
    }

    @Test
    public void testTritypIsosceles() {
        Triangle triangle = new Triangle(3, 3, 2);
        assertEquals(2, triangle.trityp());
    }

    @Test
    public void testTritypScalen() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(1, triangle.trityp());
    }
}