package main;

import modell.AutokBemutatasa;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;

public class Program {

    public static void main(String[] args) {
        //AutokBemutatasa prg = new AutokBemutatasa();
        // System.out.println(prg.bemutato());
        
        KonzolNezet nezet = new KonzolNezet();
        AutokBemutatasa modell = new AutokBemutatasa();
        KonzolVezerlo vezerlo = new KonzolVezerlo(modell, nezet);
        vezerlo.kezdes();
        vezerlo.bemutatoOsszealitasa();
        
        
    }
}
