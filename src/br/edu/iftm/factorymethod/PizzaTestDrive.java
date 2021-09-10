package br.edu.iftm.factorymethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza /*= nyStore.orderPizza("cheese")*/;
        //System.out.println("João pediu a " + pizza.getName());

        //pizza = chicagoStore.orderPizza("cheese");
       // System.out.println("Pedro pediu a " + pizza.getName());

       // pizza = nyStore.orderPizza("clam");
        //System.out.println("João pediu a " + pizza.getName());

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("João pediu a " + pizza.getName());
    }
    
}
