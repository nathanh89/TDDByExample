/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;

/**
 *
 * @author nathan
 */
public interface Expression {
    
    Money reduce(Bank bank, String to);
    
}
