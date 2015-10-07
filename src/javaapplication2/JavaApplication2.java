/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] v = {1,1,4,6,8,8,2};
        String [] v1 = {"Ana","Juan","Pedro","Lucía"};
       Histogram <Integer> histogram = CalculaHistogram.computeHisto(v); 
       
        
       for(Integer Key : histogram.keySet()){
           System.out.println(Key+":" + histogram.get(Key));
       }
        }
    }

