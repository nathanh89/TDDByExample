/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.apple;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nvaidyan
 */
public class AppleTest {
    
    @Test
    public void testBrand(){        
    
        Computer machine1 = new Computer("Apple");
        assertEquals("Apple", machine1.brand);
    }
    
    @Test
    public void nothertestBrand(){
        
        Computer machine2 = new Computer("Windows");
        assertEquals("Windows", machine2.brand);
    }
}
           
                            