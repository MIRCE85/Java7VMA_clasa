/*

Tests Threads Add and Counter - Sync
 */
package multithreadingjava72;

/**
ests Threads Add and Counter - Sync
 * @author vladu
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Counter c = new Counter();
        
        System.out.println("Valoare initiala " + c.getvalue());  
        
// inainte nu era c in paranteze. s-a facut asa ca sa ia c-ul asta
        
        Add add = new Add(c);
        Substract sub = new Substract(c);
        
        add.start();
        sub.start();
        
        System.out.println("C este final " + c.getvalue());
        
        
    }
    
}
