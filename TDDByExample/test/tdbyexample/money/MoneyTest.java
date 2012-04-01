package tdbyexample.money;

import org.junit.Test;
import static org.junit.Assert.*;
public class MoneyTest {
    
     @Test
     public void testMultiplication() {
         Dollar five= new Dollar(5);
         five.times(2);
         assertEquals(10, five.amount);
     }
     
     @Test
     public void anotherMultiplicationTest(){
         Dollar ducat= new Dollar(7);
         ducat.times(8);
         assertEquals(56, ducat.amount);
     }
}