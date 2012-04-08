/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.money;
/**
 *
 * @author nvaidyan
 */
abstract class Money {
    
    protected int amount;
    
    protected String currency;
    
    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    
    abstract Money times(int amount);
            
    String currency(){
        return currency;
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
            && getClass().equals(money.getClass());
    }
    
  
     

    
    
    
}
