package me.calebbassham.euler.p9;

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
        assertEquals(60, instance.example(), 1);
    }

    @Test
    public void answer() {
        assertEquals(31875000, instance.answer(), 1);
    }

}
