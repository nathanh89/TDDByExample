/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;

/**
 *
 * @author nvaidyan
 */
public class Dollar extends Money{
    
    private String currency;
       
    Dollar(int amount, String currency){
        super(amount, currency);
        }
    
    String currency(){
        return "USD";
    }
    
    Money times(int multiplier) {
        return Money.dollar(amount*multiplier);
    }
}