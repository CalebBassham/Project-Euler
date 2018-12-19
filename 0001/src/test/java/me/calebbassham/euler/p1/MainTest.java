package me.calebbassham.euler.p1;

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
        assertEquals(instance.example(), 23);
    }

    @Test
    public void problem() {
        assertEquals(instance.problem(), 233168);
    }

}
