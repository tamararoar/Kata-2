/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Histogram <T>{
    
    private final HashMap<T,Integer> map = new HashMap<>();  

    public Integer get (Object Key){
        return map.get(Key);
    }
    public Set <T> KeySet(){
        return map.keySet();
        
    }
    public void increment(T Key){
       map.put(Key, map.containsKey(Key)? map.get(Key)+1); 
        
    }

   

  
  
}
