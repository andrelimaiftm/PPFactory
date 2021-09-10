package br.edu.iftm.factorymethod;

public class ChicagoStyleChessePizza extends Pizza {

    public ChicagoStyleChessePizza(){
        this.nome = "Pizza de queijo no estilo de Chicago";
        this.borda = "Borda vai se larga e crocante";
        this.molho = "Molho de tomate puro";
        
        coberturas.add("Queijo Mozzarella");
    }

    public void cortar(){
        System.out.println("Corta a pizza em quadrados");
    }

}
