/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tddbyexample.money;

/**
 *
 * @author nathan
 */
public class Sum implements Expression{
    
    Expression augend;
    Expression addend;
    
    Sum(Expression augend, Expression addend){
        this.augend = augend;
        this.addend = addend;
    }
    
    public Money reduce(Bank bank, String to){
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
    
    public Expression plus(Expression addend){
        return null;
    }
}