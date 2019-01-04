package me.calebbassham.euler.p8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private Main instance;

    @Before
    public void createInstance() {
        this.instance = new Main();
    }

    @Test
    public void example() {
        Assert.assertEquals(5832, instance.example());
    }

    @Test
    public void answer() {
        Assert.assertEquals(23514624000L, instance.answer());
    }

}
