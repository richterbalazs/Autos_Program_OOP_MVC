package modell;

import java.util.ArrayList;

public class Auto {
    /* Jellemzők = adattagok */
    private String rsz, szin;
    private ArrayList<String> extrak;
    
    /* Kstr */
    public Auto(String rsz) {
        this(rsz, "piros");
    }

    public Auto(String rsz, String szin) {
        this(rsz, szin, "");
    }

    public Auto(String rsz, String szin, String extra) {
        this(rsz, szin, new ArrayList<>());
        if (!extra.isBlank()) {
            this.extrak.add(extra);
        }
    }
    
    public Auto(String rsz, String szin, ArrayList<String> extrak) {
        this.rsz = rsz;
        this.szin = szin;
        this.extrak = extrak;
    }

    /* get / is */
    public String getRsz() {
        return rsz;
    }

    public String getSzin() {
        return szin;
    }

    /* elfedjük az adattag valódi típusát, 
    az absztrakció itt: ArrayList<String> --> String[]
    */
    public String[] getExtrak() {
        String[] e = new String[extrak.size()];
        /* SAJÁT kóddal: */
//        for (int i = 0; i < e.length; i++) {
//            e[i] = extrak.get(i);
//        }
//        return e;
        
        /* Java API használattal: */
        return extrak.toArray(e);
    }

    /* set */
    //public void setSzin(String szin) {
    public void atfest(String szin) {
        this.szin = szin;
    }
    
    /* add */
    //public void addExtra(String extra){
    public void ujExtra(String extra){
        this.extrak.add(extra);
    }
    
    public void ujExtra(ArrayList<String> extrak){
        for (String extra : extrak) {
            ujExtra(extra);
        }
    }

	/* @Override és saját */
    public String bemutatas() {
        String s = "A(z) " + rsz + " rendszámú autó ";
        s += szin + " színű. ";
        String e = "Nincs benne extra.";
        if(!extrak.isEmpty()){
            e = "\nBeépített extr";
            e += extrak.size() == 1 ? "a: " : "ák: ";
            for (String extra : extrak) {
                e += "\n" + extra;
            }
        }
        
        return s+e;
    }

    
    
}
