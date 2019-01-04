package me.calebbassham.euler.p7;

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
    public void example() {
        assertEquals(13, instance.example());
    }

    @Test
    public void problem() {
        assertEquals(104743, instance.answer());
    }

}
