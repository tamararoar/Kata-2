/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author usuario
 */
public class CalculaHistogram {
    public static <T> Histogram<T> computeHisto(T[] v){
        
        Histogram<T> histo = new Histogram<>();
        for(T key : v) {
            histo.increment(key);
        }
        return histo; 
        
    }
}
