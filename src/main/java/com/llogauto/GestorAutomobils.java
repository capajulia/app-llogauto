package com.llogauto;

public class GestorAutomobils {
    
    private Automobil[] automobils;

    public GestorAutomobils(int numCotxes){
        this.automobils=new Automobil[numCotxes];
    }


    public void afegirAutomobil(Automobil auto) {
        boolean trobat = false;
        int i = 0;
        while (i < automobils.length && !trobat) {
            if (automobils[i] == null) {
                automobils[i] = auto;
                trobat = true;
            }
            i++;
        }
    }

}

