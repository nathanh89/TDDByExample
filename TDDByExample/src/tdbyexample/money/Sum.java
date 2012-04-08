/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;

/**
 *
 * @author nathan
 */
public class Sum implements Expression{
    
    Money augend;
    Money addend;
    
    Sum(Money augend, Money addend){
        this.augend = augend;
        this.addend = addend;
    }
    
    public Money reduce(String to){
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}