package br.edu.iftm.factorymethod;

public class ChicagoStyleVeggiePizza extends Pizza{
    
    public ChicagoStyleVeggiePizza(){
        this.nome = "Pizza vegetariana no estilo de Chicago";
        this.borda = "Borda vai se larga e crocante";
        this.molho = "Molho de tomate puro";
        
        coberturas.add("Queijo Mozzarella");
        coberturas.add("Azeitona preta");
        coberturas.add("Epinafre");
        coberturas.add("Beringela");

    }

    public void cortar(){
        System.out.println("Corta a pizza em quadrados");
    }


}
