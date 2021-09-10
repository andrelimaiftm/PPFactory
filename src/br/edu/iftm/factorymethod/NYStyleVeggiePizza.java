package br.edu.iftm.factorymethod;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza(){
        this.nome = "Pizza vegetariana no estilo de NY";
        this.borda = "Borda vai se fina e crocante";
        this.molho = "Molho marinado";
        
        coberturas.add("Grande queijo regiano");
        coberturas.add("Alho");
        coberturas.add("Cebola");
        coberturas.add("Cogumelos");
        coberturas.add("Pimenta vermelha");       

    } 

}
