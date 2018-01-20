/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masina;

/**
 *
 * @author vladu
 */
public class car implements Saleable, Rentable {

  

    public enum Color {WHITE, RED, YELLOW, GREEN, GRAY, BLACK};
    /**
     * Internal hidden fields / attributes
     */
    private Color color;
    private String name;
    private short speed;

    public car() {
     name = "Default car name";
     speed=90;
     
    }
      

    public car(Color carcolor, String carname, short carspeed) {
        color = carcolor;
        name = carname;
        speed = carspeed;
    }
    
    
    
}
