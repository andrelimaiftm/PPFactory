package br.edu.iftm.factorymethod;

public class ChicagoStyleClamPizza extends Pizza{

    public ChicagoStyleClamPizza(){
        this.nome = "Pizza de molusculos no estilo de Chicago";
        this.borda = "Borda vai se larga e crocante";
        this.molho = "Molho de tomate puro";
        
        coberturas.add("Queijo Mozzarella");
        coberturas.add("Congelados da Baía de chesapeake");
        

    }

    public void cortar(){
        System.out.println("Corta a pizza em quadrados");
    }

}
