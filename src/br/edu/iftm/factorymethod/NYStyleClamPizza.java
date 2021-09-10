package br.edu.iftm.factorymethod;

public class NYStyleClamPizza extends Pizza{

    public NYStyleClamPizza(){
        this.nome = "Pizza de frutos do mar no estilo de NY";
        this.borda = "Borda vai se fina e crocante";
        this.molho = "Molho marinado";
        
        coberturas.add("Grande queijo regiano");
        coberturas.add("Molusculos frescos de Long island");        
    } 

}
