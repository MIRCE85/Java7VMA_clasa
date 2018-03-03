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
public class Add extends Thread {
    // se face un pointer
        private Counter cAdd;
    // constructir care ia valoarea din maine
        
    public Add (Counter counterFromMain){
                cAdd = counterFromMain;
    }
    
    @Override
    public void run(){
                 
        
      //  Counter c = new Counter();  - nu are ce cauta
        for (int i=0;i<500;i++){
        cAdd.increment();
        
        System.out.println("Inceremented to:  " +cAdd.getvalue());
        
        }
        
    
    
    }
    
}
