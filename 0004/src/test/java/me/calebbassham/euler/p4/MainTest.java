package me.calebbassham.euler.p4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

    private Main instance;

    @Before
    public void createInstance() {
        this.instance = new Main();
    }

    @Test
    public void example() {
        assertEquals(9009, instance.twoDigits());
    }

    @Test
    public void answer() {
        assertEquals(906609, instance.threeDigits());
    }

    @Test
    public void reverseString() {
        assertEquals("dlrow", instance.reverse("world"));
    }

    @Test
    public void isPalindrome() {
        assertTrue(instance.isPalindrome("racecar"));
    }

}
