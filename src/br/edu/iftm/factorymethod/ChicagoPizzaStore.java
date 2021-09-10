package br.edu.iftm.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleChessePizza();
        }else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else if(item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else{
            return null;
        } 
    }
    
}
