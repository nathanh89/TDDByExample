/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;
/**
 *
 * @author nvaidyan
 */
class Money {
    
    protected int amount;
    
    protected String currency;
    
    public String toString(){
        return amount + " " + currency;
    }
    
    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
                
    String currency(){
        return currency;
    }
    
    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }
    
    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    } 
    
    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }
    
    public boolean equals(Object object){
        Money money= (Money) object;
        return amount == money.amount
            && currency().equals(money.currency());
    }
    
  
     

    
    
    
}
