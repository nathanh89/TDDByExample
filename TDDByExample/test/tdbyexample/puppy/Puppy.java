/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdbyexample.puppy;

/**
 *
 * @author nvaidyan
 */
public class Puppy {
    String emotion;
    int wagState;
    
    Puppy(String emotion){
        this.emotion= emotion;
    }
    
    void wag(){
      this.emotion = "Happy";
    }
        
    
    
}
