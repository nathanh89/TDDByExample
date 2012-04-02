package tdbyexample.money;

import org.junit.Test;
import static org.junit.Assert.*;
public class MoneyTest {
    
     @Test
     public void testMultiplication() {
         Dollar five= new Dollar(5);
         assertEquals(new Dollar(10), five.times(2));
         assertEquals(new Dollar(15), five.times(3));
     }
     
     @Test
     public void testEquality() {
         assertTrue(new Dollar(5).equals(new Dollar(5)));
     }
     
     @Test
     public void secondtestEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertFalse(new Dollar(8).equals(new Dollar(19)));
    }
    
     @Test
     public void testDifferentTypes(){
         assertTrue(new Dollar(4).equals(new Dollar(4)));
     }
     
}