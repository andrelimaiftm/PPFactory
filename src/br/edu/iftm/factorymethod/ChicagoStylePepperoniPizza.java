package br.edu.iftm.factorymethod;

public class ChicagoStylePepperoniPizza extends Pizza{
    
    public ChicagoStylePepperoniPizza(){
        this.nome = "Pizza de pepperoni no estilo de Chicago";
        this.borda = "Borda vai se larga e crocante";
        this.molho = "Molho de tomate puro";
        
        coberturas.add("Queijo Mozzarella");
        coberturas.add("Azeitona preta");
        coberturas.add("Epinafre");
        coberturas.add("Beringela");
        coberturas.add("fatias de pepperoni");
        
        

    }

    public void cortar(){
        System.out.println("Corta a pizza em quadrados");
    }

}
