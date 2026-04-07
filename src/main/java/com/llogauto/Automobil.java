package com.llogauto;

public class Automobil {

    String marca;
    String model;
    String matricula;
    public static int comptador=0;

    public Automobil (String marca, String model, String matricula){
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        comptador++;
    }

        Automobil(){
        this.marca = "";
        this.model = "";
        this.matricula = "";
        comptador --;
    }

    public String mostrarDades(){
        return " marca : " + this.marca + "   model: " + this.model + "  matricula:" + this.matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static boolean validarMatricula(String matricula){
       return matricula != null && matricula.matches("^[0-9]{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}$");
    }

    public static void setComptador(int comptador) {
        Automobil.comptador = comptador;
    }

}
