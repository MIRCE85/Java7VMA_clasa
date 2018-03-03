/*
 * Counter is a comon used instance by two paralele threads
 */
package multithreadingjava72;

/**
 *
 * Counter is a comon used instance by two paralele threads
 * @ author vladu
 * 
 */
public class Counter {
    // ori pui volatile pe variabila -> ori pui syncronized pe metoda. este redundand sa fie asa. se fac 3 cozi DAR creste timpul de rulare. nu 
private  volatile int c = 0;//var. comuna
    // sync s-a pus ulterior ca sa faca o coada pe metoda.
synchronized public void increment() {
c++;
}
synchronized public void decrement() {
c--;
}
public int getvalue() {
return c;
}

}
