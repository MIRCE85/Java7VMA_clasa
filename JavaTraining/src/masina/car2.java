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
public class car2 implements Saleable, Rentable {

   public enum Color {WHITE, RED, YELLOW, GREEN, GRAY, BLACK};
    /**
     * Internal hidden fields / attributes
     */
    private Color color;
    private String name;
    private short speed;

    public car2() {
     name = "Default car name";
     speed=90;
     
    }
      

    public car2(Color carcolor, String carname, short carspeed) {
        color = carcolor;
        name = carname;
        speed = carspeed;
    }
    
    /*get-ers and set-ers*/
    public String getName() {
        return (name);
    }

    public Color getColor() {
        return (color);
    }

    public short getSpeed() {
        return (speed);
    }

    public void setName(String newName) {
        name = newName;
    }
    
    public void setColor(Color newColor) {
        color = newColor;
    }

    public void setSpeed(short newSpeed) {
        speed = newSpeed;
    }

    /**
     * The method increase actual speed of Car until final speed specified.
     *
     * @param newSpeed is new speed
     */
    public void increaseSpeed(short newSpeed) {
        if (newSpeed > speed) {
            speed = newSpeed;
        } else if (newSpeed < speed) {
            decreaseSpeed(newSpeed);
        }
    }

    /**
     * The method decrease actual speed of Car until final speed specified.
     *
     * @param newSpeed is new speed
     */
    public void decreaseSpeed(short newSpeed) {
        if (newSpeed < speed) {
            speed = newSpeed;
        } else if (newSpeed < speed) {
            increaseSpeed(newSpeed);
        }
    }

    /**
     * Abstract method defined in Saleable interface implemented by class car2 is
 implemented here.
     *
     * @override Saleable.getSalePrice() method
     */
    @Override
    public int getSalePrice() {
        return (12000);
    }

    /**
     * Abstract method defined in Rentable interface implemented by class car2 is
 implemented here.
     *
     * @override Rentable.getDailyRentPrice() method
     */
    @Override
    public int getDailyRentPrice() {
        return (250);
    } 
    
}
