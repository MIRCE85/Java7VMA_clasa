/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingjava72;

/**
 *
 * @author vladu
 */
public class Substract extends Thread {
    
    // este o referinta!~.. nu fac cu NEW -- trebuie sa se duca spre zona de memorie
    private Counter cSub;
    
    // cosntructorul sa ainba un paramteru care se duce in main
    
    public Substract (Counter counterFromMain)
    {
    cSub = counterFromMain;}
    
    
     @Override
   
    public void run() {
      
//Counter c = new Counter();

      for (int i=0;i<500;i++){
        cSub.decrement();
        
       System.out.println("Decemented to: " +cSub.getvalue());
}
    }
        
    
    
}
