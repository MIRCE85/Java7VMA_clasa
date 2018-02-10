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
public class Exceptii1 {

    
    public static void main(String[] args) {
       
        try{
            
            pseudoException();
            generateException();
            System.out.println("Codul de dupa metoda generate Exception");
        }
        
        catch(ArithmeticException ae)        
                    {
        System.out.println("Nu se poate imparti cu 0!");
        }
        
        finally {
            
        System.out.println("Codul de la finally");
        
        }
    }
     
        private static void pseudoException() throws ArithmeticException{
        ArithmeticException pseudoException = new ArithmeticException("Teapa personalziata");
        throw(pseudoException);
                
    }
    
    
    public static void generateException() throws ArithmeticException{
            int i = 100;
            int j = 0;
            int k = i/j;
           
    }
    
}
