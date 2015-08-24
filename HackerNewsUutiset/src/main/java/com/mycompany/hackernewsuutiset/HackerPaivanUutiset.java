
package com.mycompany.hackernewsuutiset;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.paivanuutiset.PaivanUutiset;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HackerPaivanUutiset implements PaivanUutiset {

    @Override
    public String haeSuosituinUutinen() {
        String vastaus = HTTPClient.callURL("http://hs.fi");
        System.out.println("Vastaus: " + vastaus);
        return vastaus;
    }

    @Override
    public String haeViimeisinUutinen() {
        String uusin = HTTPClient.callURL("https://hacker-news.firebaseio.com/v0/newstories.json");
        
        System.out.println("UUSIN: " + uusin);
        uusin = uusin.replace("[", "");
        uusin = uusin.replace("]", "");
        String[] array = uusin.split(",");
        System.out.println("Arrayn eka: " + array[0]);
        System.out.println("Array: " + Arrays.toString(array));
        //String vastaus = HTTPClient.callURL("https://hacker-news.firebaseio.com/v0/item/" + ids[0] + ".json?print=pretty");
        //System.out.println("VASTAUS: " + vastaus);
        //Uutinen uutinen = gson.fromJson(vastaus, Uutinen.class);
        return "";
    }
    
}
