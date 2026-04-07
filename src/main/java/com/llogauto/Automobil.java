package com.llogauto;

public class Automobil {

    String marca;
    String model;
    String matricula;


    public Automobil (String marca, String model, String matricula){
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
    }

    public String mostrarDades(){
        return " marca : " + this.marca + "   model: " + this.model + "  matricula:" + this.matricula;
    }

}
