
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5EvenTest {
    Q5Even q5Even;

    @Before
    public void setUp() throws Exception {
        q5Even =new Q5Even();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {
        Boolean b=q5Even.isEven(66);
        assertEquals(true,b);
    }

    @Test
    public void isNotEven() {
        Boolean b=q5Even.isNotEven(67);
        assertEquals(false,b);
    }
}