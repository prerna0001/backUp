

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1ReversetheInputTest {
    Q1ReversetheInput q1ReversetheInput;

    @Before
    public void setUp() throws Exception {
        q1ReversetheInput=new Q1ReversetheInput();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindrom() {
        String s= q1ReversetheInput.palindrom(56765);
        assertEquals("its a palindrome",s);
        assertNotEquals("its not a palindrome",s);

    }
    @Test
    public void palindromNot() {
        String s= q1ReversetheInput.palindrom(48778);
        assertNotEquals("its a palindrome",s);
        assertEquals("its not a palindrome",s);

    }
}