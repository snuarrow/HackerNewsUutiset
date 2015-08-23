
package com.mycompany.hackernewsuutiset;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.paivanuutiset.PaivanUutiset;
import java.lang.reflect.Array;

public class HackerPaivanUutiset implements PaivanUutiset {

    @Override
    public String haeSuosituinUutinen() {
        String vastaus = HTTPClient.callURL("http://hs.fi");
        System.out.println("Vastaus: " + vastaus);
        return vastaus;
    }

    @Override
    public String haeViimeisinUutinen() {
        String uusin = HTTPClient.callURL("https://hacker-news.firebaseio.com/v0/newstories");
        Gson gson = new GsonBuilder().create();
        String[] ids = gson.fromJson(uusin, String[].class);
        System.out.println("ID: " + ids[0]);
        String vastaus = HTTPClient.callURL("https://hacker-news.firebaseio.com/v0/item/" + ids[0] + ".json?print=pretty");
        System.out.println("VASTAUS: " + vastaus);
        Uutinen uutinen = gson.fromJson(vastaus, Uutinen.class);
        return uutinen.toString();
    }
    
}
