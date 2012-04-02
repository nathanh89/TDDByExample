/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;

/**
 *
 * @author nvaidyan
 */
public class Dollar {
    private int amount;
    
    public boolean equals(Object boo){
        Dollar dollar= (Dollar) boo;
        return amount == dollar.amount;
      
    }
    
    Dollar(int amount){this.amount= amount;}
    Dollar times(int multiplier) {
        return new Dollar(amount*multiplier);
    }
}