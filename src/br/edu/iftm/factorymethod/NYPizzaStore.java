package br.edu.iftm.factorymethod;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new NYStyleChessePizza();
        }else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if(item.equals("clam")){
            return new NYStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else{
            return null;
        } 
    }
    
}
