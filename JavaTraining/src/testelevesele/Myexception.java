/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelevesele;

import static java.lang.reflect.Array.set;

/**
 *
 * @author vladu
 */
public class Myexception extends RuntimeException {

    @Override
    public void printStackTrace() {
        String newMessage = "My message is about my exception";
         //To change body of generated methods, choose Tools | Templates.
  //      String finalMessage = super.printStackTrace();
    }

    
    
    
}
