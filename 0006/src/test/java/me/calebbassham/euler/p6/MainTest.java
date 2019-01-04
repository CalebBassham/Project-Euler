package me.calebbassham.euler.p6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private Main instance;

    @Before
    public void createInstance() {
        this.instance = new Main();
    }

    @Test
    public void answer() {
        assertEquals(25164150, instance.answer());
    }

    @Test
    public void example() {
        assertEquals(2640, instance.example());
    }

    @Test
    public void squareOfSum() {
        assertEquals(3025, instance.squareOfSum(10));
    }

    @Test
    public void sumOfSquares() {
        assertEquals(385, instance.sumOfSquares(10));
    }

}
