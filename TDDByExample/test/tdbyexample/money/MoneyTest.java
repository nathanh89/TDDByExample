package tdbyexample.money;

import org.junit.Test;
import static org.junit.Assert.*;
public class MoneyTest {
    
    /* @Test
     public void testMultiplication() {
         Dollar five= new Dollar(5, null);
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
     
     @Test
     public void testFrancMulitplication(){
         Money five =Money.franc(5);
         assertEquals(Money.franc(10), five.times(2));
         assertEquals(Money.franc(15), five.times(3));
     }
     
     @Test
     public void testEqualityFrancs(){
         assertTrue(new Dollar(5).equals(new Dollar(5)));
         assertFalse(new Dollar(9).equals(new Dollar(7)));
         assertTrue(new Franc(5).equals(new Franc(5)));
         assertFalse(new Franc(5).equals(new Franc(8)));
     }
     
     @Test
     public void testEqualityCurrencies(){
         assertTrue(new Dollar(5).equals(new Dollar(5)));
         assertFalse(new Dollar(5).equals(new Dollar(6)));
         assertTrue(new Franc(5).equals(new Franc(5)));
         assertFalse(new Franc(5).equals(new Franc(6)));
         assertFalse(new Dollar(5).equals(new Franc(5)));
     }
     
     @Test
     public void testMultiplicationMoney(){
         Money five = Money.dollar(5);
         assertEquals(new Dollar(10), five.times(2));
         assertEquals(new Dollar(15), five.times(3));
     }
     
     @Test
     public void testEqualityAbstractMoney(){
         assertTrue(Money.dollar(5).equals(Money.dollar(5)));
         assertFalse(Money.dollar(5).equals(Money.dollar(6)));
         assertFalse(Money.franc(5).equals(Money.franc(6)));
         assertTrue(Money.franc(5).equals(Money.franc(5)));
         assertFalse(new Franc(5).equals(Money.dollar(5)));
         
     }
    */
     @Test
     public void testCurrencyIndicator(){
         assertEquals("USD", Money.dollar(1).currency());
         assertEquals("CHF", Money.franc(1).currency());
     }
     
     @Test
     public void testMultiplicationUpdated(){ 
         assertEquals(Money.dollar(10), (Money.dollar(5)).times(2));
         assertEquals(Money.franc(10), (Money.franc(5)).times(2));

     }
     
     @Test
     public void testNumericalEqualityUpdated(){
         assertTrue(Money.dollar(8).equals(Money.dollar(8)));
         assertFalse(Money.dollar(4).equals(Money.dollar(2)));
         assertTrue(Money.franc(8).equals(Money.franc(8)));
         assertFalse(Money.franc(4).equals(Money.franc(2)));
     }
     
     @Test
     public void testDifferentClassEquality(){
         assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
     }
}