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
       
    Dollar(int amount){this.amount= amount;}
    Dollar times(int multiplier) {
        return new Dollar(amount*multiplier);
    }
}