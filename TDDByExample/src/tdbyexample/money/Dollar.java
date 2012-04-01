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
    int amount;
    Dollar(int amount){this.amount= amount;}
    void times(int multiplier) {amount*= multiplier;}
}