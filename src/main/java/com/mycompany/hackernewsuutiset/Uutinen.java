
package com.mycompany.hackernewsuutiset;

public class Uutinen {
    
    private String title;
    private String by;
    private String url;
   
    @Override
    public String toString() {
        
        System.out.println("");
        System.out.println("");
        
        return title  + " by " + by + ", url: " + url;
    }
    
}
