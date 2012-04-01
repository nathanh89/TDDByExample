package tdbyexample.puppy;

import org.junit.Test;
import static org.junit.Assert.*;

public class PuppyTest {
    
    @Test
    public void testHappiness() {
        Puppy boogie = new Puppy("Sad");
        boogie.wag();
        assertEquals("Happy", boogie.emotion);
    }
}