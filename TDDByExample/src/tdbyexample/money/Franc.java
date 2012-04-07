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
    
    Franc(int amount){this.amount= amount;}

    Money times(int multiplier) {
        return new Franc(amount*multiplier);
    }
    
}
