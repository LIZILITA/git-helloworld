package org.practischool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void helloWorld() {
        assertEquals(App.helloWorld().toLowerCase(), "hello world");
    }
}
