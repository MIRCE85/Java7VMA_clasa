/*A
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelevesele;

/**
 *
 * @author vladu
 */
public class Exceptii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{
            int i = 100;
            int j = 0;
            int k = i/j;
        }
        catch(ArithmeticException ae)
        {
        System.out.println("Nu se poate imparti cu 0!");
        
        }
        
        
        
    }
    
}
