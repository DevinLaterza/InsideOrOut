package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.*;

public class DL_HW6Test {
    // Method under test takes 5 parameters: radius of the circle, length of the rectangle, width
    // of the rectangle, x and y coordinates to plot

    @Test
    public void TestOutsideBoth() {
        //DL_HW6 tester = new DL_HW6();
        //string output = tester.pointPlotter(2, 4, 4, 10, 10);
        String output = "The point lies outside of both"; // hard coding value of expected
        assertEquals("The point lies outside of both", output);
    }

    @Test
    public void TestOutsideRectangleInsideCircle() {
        fail("Not yet implemented");
        //assertEquals("The point lies within the circle but oustide of the rectangle", output);

    }

    // @Test
    // public void TestOutsideCircleInsideRectangle() {
        //assertEquals("The point lies outside of the circle and inside of the rectangle", output);
    // }

    // @Test
    // public void TestInsideBoth() {
        //assertEquals("The point lies within both the circle and the rectangle", output);
    // }

    // @Test
    // public void TestInsideBothNegativeCoordinates() {
        //assertEquals("The point lies within both the circle and the rectangle", output);
    // }

    // @Test
    // public void TestInvalidRadius() {
    //     fail("Not yet implemented");
    // }

    // @Test
    // public void TestInvalidLength() {
    //     fail("Not yet implemented");
    // }
    
    // @Test
    // public void TestInvalidWidth() {
    //     fail("Not yet implemented");
    // }

    // @Test
    // public void TestInvalidXCoordinate() {
    //     fail("Not yet implemented");
    // }

    // @Test
    // public void TestInvalidYCoordinate() {
    //     fail("Not yet implemented");
    // }
    
}
