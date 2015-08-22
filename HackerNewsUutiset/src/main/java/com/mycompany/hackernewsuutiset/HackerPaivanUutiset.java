
package com.mycompany.hackernewsuutiset;

import com.mycompany.paivanuutiset.PaivanUutiset;

public class HackerPaivanUutiset implements PaivanUutiset {

    @Override
    public String haeSatunnainenUutinen() {
        String vastaus = HTTPClient.callURL("hs.fi");
        System.out.println("Vastaus: " + vastaus);
        return vastaus;
    }

    @Override
    public String haeLyhytUutinen() {
        String vastaus = HTTPClient.callURL("hs.fi");
        System.out.println("Vastaus: " + vastaus);
        return vastaus;
    }
    
}
