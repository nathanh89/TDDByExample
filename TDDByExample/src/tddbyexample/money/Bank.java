/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tddbyexample.money;
import java.util.Hashtable;

/**
 *
 * @author nathan
 */
public class Bank {
    
    private Hashtable rates = new Hashtable();
    
    int rate(String from, String to){
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
    
    Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }
    
    void addRate(String from, String to, int rate){
        rates.put(new Pair(from, to), new Integer(rate));
    }
    private class Pair {
    
    private String from;
    private String to;
    
    Pair(String from, String to) {
        this.from = from;
        this.to=to;
    }
    
    public boolean equals(Object object){
        Pair pair = (Pair) object;
        return from.equals(pair.from) && to.equals(pair.to);
    }
    
    public int hashCode(){
        return 0;
    }
}
    
}
