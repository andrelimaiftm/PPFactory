package br.edu.iftm.factorymethod;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String item);

    public Pizza orderPizza(String tipo){
        Pizza pizza = createPizza(tipo);
        System.out.println("--- Montando a " + pizza.getName() + " ---");
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.encaixotar();
        return pizza;
    }
    
}
