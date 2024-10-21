
package vezerlo;

import modell.Auto;
import modell.AutokBemutatasa;
import nezet.KonzolNezet;

public class KonzolVezerlo {
    private AutokBemutatasa modell;
    private KonzolNezet nezet;
    
    public KonzolVezerlo(AutokBemutatasa modell, KonzolNezet nezet){
        this.modell = modell;
        this.nezet = nezet;
        
        kezdes();
        
        
      
    }

    public void kezdes() {
        // a modell állapotát megjeleníti a nézet:
        String adat = this.modell.bemutatMindet(); 
        this.nezet.megjelenit(adat);
        
        // a modell frissitett adatai jelennek meg a nézetben
        modell.tuning(); // nincs bekérés, de változik a modell
        nezet.megjelenit("tuning után:\n");
        nezet.megjelenit(modell.bemutatEgyet(0)); // megjelenítjük az aktuális 
    }
    
    public void bemutatoOsszealitasa() {
        Auto auto = modell.getAutok()[0];
        nezet.megjelenit("\n tuningolt autó: \n"+auto.bemutatas());
    }
}
