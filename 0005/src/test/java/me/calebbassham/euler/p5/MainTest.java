package me.calebbassham.euler.p5;

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
        assertEquals(2520, instance.example());
    }

    @Test
    public void answer() {
        assertEquals(232792560, instance.answer());
    }
}
