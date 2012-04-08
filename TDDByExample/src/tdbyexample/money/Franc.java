/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;

/**
 *
 * @author nvaidyan
 */
public class Franc extends Money{
    
    private String currency;
    
    Franc(int amount, String currency){
        super(amount, currency);
    }
    
    String currency(){
        return "CHF";
    }

    Money times(int multiplier) {
        return Money.franc(amount*multiplier);
    }
  
}
