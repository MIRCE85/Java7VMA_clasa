/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.Scanner;
/**
 *
 * @author vladu
 */
public class Add_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        String operatie;
                
      System.out.println("Enter two integers to calculate them ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      
      
System.out.println("Ce fel de operatiune se doreste: suma sau diferenta");
       Scanner op = new Scanner(System.in);
          operatie = op;
            if operatie = "suma" than
             z = x + y;
       else
             z = x - y;
     end if
                       
 System.out.println(operatie + " of entered integers = "+z);
}}