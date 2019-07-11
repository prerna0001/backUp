

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2Power4Test {
    Q2Power4 q2Power4;

    @Before
    public void setUp() throws Exception {
        q2Power4=new Q2Power4();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void power() {
        boolean b=q2Power4.power(64);
        assertEquals(true,b);
    }
    @Test
    public void powernot() {
        boolean b=q2Power4.power(32);
        assertEquals(false,b);
    }
}