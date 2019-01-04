package me.calebbassham.euler.p10;

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
        Assert.assertEquals(17, instance.example());
    }

    @Test
    public void answer() {
        Assert.assertEquals(142913828922L, instance.answer());
    }

}
