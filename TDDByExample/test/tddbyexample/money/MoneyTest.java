package tddbyexample.money;

import tddbyexample.money.Sum;
import tddbyexample.money.Bank;
import tddbyexample.money.Expression;
import tddbyexample.money.Money;
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
     
     @Test
     public void testPlusReturnSum(){
         Money five = Money.dollar(5);
         Expression result = five.plus(five);
         Sum sum = (Sum) result;
         assertEquals(five, sum.augend);
         assertEquals(five, sum.addend);
     }
     
     @Test
     public void testReduceMoney(){
         Bank bank = new Bank();
         Money result = bank.reduce(Money.dollar(1), "USD");
         assertEquals(Money.dollar(1), result);
     }
     
     @Test
     public void testReduceSum(){
         Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
         Bank bank = new Bank();
         Money result = bank.reduce(sum, "USD");
         assertEquals(Money.dollar(7), result);
     }
     
     @Test
     public void testReduceMoneyDifferentCurrency(){
         Bank bank = new Bank();
         bank.addRate("CHF", "USD", 2);
         Money result = bank.reduce(Money.franc(2), "USD");
         assertEquals(Money.dollar(1), result);
     }
     
     @Test
     public void  testIdentityRate(){
         assertEquals(1, new Bank().rate("USD", "USD"));
     }
     
     @Test
     public void testMixedAddition(){
         Expression fiveBucks = Money.dollar(5);
         Expression tenFrancs = Money.franc(10);
         Bank bank = new Bank();
         bank.addRate("CHF", "USD", 2);
         Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
         assertEquals(Money.dollar(10), result);
     }
}