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
        
    public boolean equals(Object object){
        Money money= (Money) object;
        return amount == money.amount;
      
    }
    
    Franc(int amount){this.amount= amount;}
    Franc times(int multiplier) {
        return new Franc(amount*multiplier);
    }
    
}