/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;

/**
 *
 * @author nvaidyan
 */
public class Franc {
    
    private int amount;
    
    public boolean equals(Object object){
        Franc franc= (Franc) object;
        return amount == franc.amount;
      
    }
    
    Franc(int amount){this.amount= amount;}
    Franc times(int multiplier) {
        return new Franc(amount*multiplier);
    }
    
}
