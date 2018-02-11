/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masina;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mircea
 */
public class CarTest {
    
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setRentingPrice method, of class Car.
     */
    @Test
    public void testSetRentingPrice() {
        System.out.println("setRentingPrice");
        double rentingPrice = 1000;
        Car instance = new Car (Car.Marca.Mercedes, Car.Culoare.BLACK,230,460,50000);
        instance.setRentingPrice(rentingPrice);
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
        
    }

    /**
     * Test of setSalesPrice method, of class Car.
     */
    @Test
    public void testSetSalesPrice() {
        System.out.println("setSalesPrice");
        double salesPrice = 50000;
        Car instance = new Car (Car.Marca.Mercedes, Car.Culoare.BLACK,230,460,50000);
        instance.setSalesPrice(salesPrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car (Car.Marca.Mercedes, Car.Culoare.BLACK,230,460,50000);
        double expResult = 150000;
        double result = instance.getSalePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        ///fail("The test case is a prototype.");
        
        
    }

    /**
     * Test of getDailyRentPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentPrice() {
        System.out.println("getDailyRentPrice");
        Car instance = new Car (Car.Marca.Mercedes, Car.Culoare.BLACK,230,460,50000);
        double expResult = 50000;
        double result = instance.getDailyRentPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        short newSpeed = 0;
        Car instance = null;
        instance.increaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        short newSpeed = 0;
        Car instance = null;
        instance.decreaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertEquals(double expResult, double result, double par) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
