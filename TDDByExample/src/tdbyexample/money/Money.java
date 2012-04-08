/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;
/**
 *
 * @author nvaidyan
 */
class Money implements Expression{
    
    protected int amount;
    
    protected String currency;
    
    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
          
    static Money dollar(int amount){
        return new Money(amount, "USD");
    } 
    
    static Money franc(int amount){
        return new Money(amount, "CHF");
    }
          
    String currency(){
        return currency;
    }
    
    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }
    
    Expression plus(Money addend){
        return new Money(amount + addend.amount, currency);
    }
    
    public boolean equals(Object object){
        Money money= (Money) object;
        return amount == money.amount
            && currency().equals(money.currency());
    }
    
  
     

    
    
    
}
