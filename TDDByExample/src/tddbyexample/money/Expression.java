/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tddbyexample.money;

/**
 *
 * @author nathan
 */
public interface Expression {
    
    Money reduce(Bank bank, String to);
    
    Expression plus(Expression addend);
    
}
