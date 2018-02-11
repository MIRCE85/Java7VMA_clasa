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

public class Car implements Saleable, Rentable {

    
 public enum Culoare {RED, YELLOW, BLUE, BLACK, WHITE};
    public enum Marca {Mercedes, Renault, Dacia};
    
    private Culoare carColor = Culoare.BLACK;    
    private double speed = 0.0;
    private Marca name = Marca.Dacia;
    
    
    private double rentingPrice = 0;

        public void setRentingPrice(double rentingPrice) {
        this.rentingPrice = rentingPrice;
    }
  
    private double salesPrice = 0;
    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }
  
            
   @Override
    public double getSalePrice() {
            return salesPrice;
    }

   @Override
    public double getDailyRentPrice() {
        return rentingPrice;        
    }
    
    Car(Marca nouaMarca, Culoare nouaCuloare, double nouaViteza, double newRentingPrice, double newSalesPrice){
    salesPrice = newSalesPrice;
    rentingPrice = newRentingPrice;
    carColor = nouaCuloare;
    name = nouaMarca;
    speed = nouaViteza;
    }
    
    public void increaseSpeed(short newSpeed){
if(newSpeed > speed){
speed = newSpeed;
}
else if (newSpeed < speed){
decreaseSpeed(newSpeed);
}
}
    public void decreaseSpeed(short newSpeed){
if(newSpeed < speed){
speed = newSpeed;
}
else if (newSpeed < speed){
increaseSpeed(newSpeed);
}
}
}