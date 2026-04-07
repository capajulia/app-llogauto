package com.llogauto;

public class Main {
    public static void main(String[] args) {

        Automobil auto1= new Automobil();
        Automobil auto2= new Automobil();
        Automobil auto3= new Automobil();

        auto1.setMarca("Porche");
        auto1.setModel("Cayene");
        auto1.setMatricula("2323ABC");
        System.out.println(auto1.mostrarDades());
        
         auto2.setMarca("Mercedes");
        auto1.setModel("CLA");
        auto1.setMatricula("1234ABC");
        System.out.println(auto2.mostrarDades());

         auto3.setMarca("VW");
        auto3.setModel("Golf");
        auto3.setMatricula("2222ABC");
        System.out.println(auto3.mostrarDades());






    }

}