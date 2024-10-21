package modell;

import java.util.ArrayList;
import java.util.Arrays;

public class AutokBemutatasa {
    private Auto[] autok;

    public Auto[] getAutok() {
        return Arrays.copyOf(autok, autok.length);
    }

    public AutokBemutatasa() {
        Auto a0 = new Auto("abc-000");
        Auto a1 = new Auto("abc-001", "kék");
        Auto a2 = new Auto("abc-002", "zöld", "ABS");
        
        ArrayList<String>extrak = new ArrayList<>();
        extrak.add("ABS");
        extrak.add("Klíma");
        extrak.add("Bőrülés");
        Auto a3 = new Auto("abc-003", "ezüst", extrak);
        
        autok = new Auto[4];
        autok[0] = a0;
        autok[1] = a1;
        autok[2] = a2;
        autok[3] = a3;
    }
    
    public String bemutatMindet(){
        String s = "*** Bemutató ***\n";
        for (Auto auto : autok) {
            s += auto.bemutatas();
            s += "\n-----------------\n";
        }
        return s;
    }
    
    public void tuning(int i){
        if (i < autok.length){
            tuning(autok[i]);
        }else{
            //
        }
    }
    
    public void tuning(Auto auto){
        if (auto != null) {
            auto.atfest("lila");
            auto.ujExtra("ABS");
        }else{
            // NULL KEZELÉSE -> KIVÉTEL
        }
    }
    
    
    public void tuning(){
        Auto auto = autok[0];
        auto.atfest("lila");
        auto.ujExtra("tetőcsomagtartó");
    }
    
    public String bemutatEgyet(int i){
        String s = "";
        if(i < autok.length){
            s = bemutatEgyet(autok[i]);
        }else {
            
        }
        return s;
    }
    
    public String bemutatEgyet(Auto auto){
        String s = "";
        if (auto != null){
            s = auto.bemutatas();
        }else{
            
        }
        return s;
    }
}
