/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;

/**
 *
 * @author nvaidyan
 */
public class Money {
    
    protected int amount;
    
    public boolean equals(Object object){
        Money money= (Money) object;
        return amount == money.amount
            && getClass().equals(money.getClass());
      
    }
    
    
}
