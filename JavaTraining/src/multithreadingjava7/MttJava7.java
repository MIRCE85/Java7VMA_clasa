/*
 *Program launched two different threads

 */
package multithreadingjava7;

/**
 *
 * @author vladu
 */
public class MttJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //creaza cele doua threaduri
        HelloWorld thread1 = new HelloWorld();
        SalutLume thread2 = new SalutLume();
                
        // get priorities
        System.out.println("Prioritate thread1: "+thread1.getPriority());
        System.out.println("Prioritate thread1: "+thread2.getPriority());
        
        //set priority ca la in ROmana sa fie prioritar
       // thread2.setPriority(10);
        //thread1.setPriority(1);
        
        // incercam sa obtinem ordinea prin setarea parametrilor de sleep
        //Thread.sleep(00);
        
        //incercam cu metoda interurpt ca sa intrerupa threadul 2
                        
        thread1.start();
              
        
        // join
        //wait
        
        
        thread2.start();
        thread2.interrupt();
        
    }
    
}
