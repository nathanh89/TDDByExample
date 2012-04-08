package tdbyexample.money;

import org.junit.Test;
import static org.junit.Assert.*;
public class MoneyTest {
       
     @Test
     public void testCurrencyIndicator(){
         assertEquals("USD", Money.dollar(1).currency());
         assertEquals("CHF", Money.franc(1).currency());
     }
     
     @Test
     public void testMultiplication(){ 
         assertEquals(Money.dollar(10), (Money.dollar(5)).times(2));
         assertEquals(Money.franc(10), (Money.franc(5)).times(2));

     }
     
     @Test
     public void testEqualitySingleClass(){
         assertTrue(Money.dollar(8).equals(Money.dollar(8)));
         assertFalse(Money.dollar(4).equals(Money.dollar(2)));
         assertFalse(Money.franc(4).equals(Money.dollar(4)));
     }
     
     @Test
     public void testDifferentClassEquality(){
         assertTrue(new Money(10, "CHF").equals(new Money(10, "CHF")));
     }
     
     @Test
     public void testSimpleAddition(){
         Money five = Money.dollar(5);
         Expression sum = five.plus(five);
         Bank bank = new Bank();
         Money reduced = bank.reduce(sum, "USD");
         assertEquals(Money.dollar(10), reduced);
     }
}