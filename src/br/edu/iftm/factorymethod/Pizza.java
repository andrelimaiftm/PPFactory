package br.edu.iftm.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
    String nome;
    String borda;
    String molho;
    ArrayList coberturas = new ArrayList();

    public void preparar(){
        System.out.println("Preparando" + this.nome);
        System.out.println("Preparando a massa");
        System.out.println("Adicionando o molho");
        System.out.println("Adicionando coberturas");
        for (int i=0; i < coberturas.size(); i++) {
            System.out.println(" " + coberturas.get(i));
        }
    }

    public void assar(){
        System.out.println("Asse por 25 minutos a 350 graus");
    }

    public void cortar(){
        System.out.println("Cortando a pizza em pedações diagonais");
    }

    public void encaixotar(){
        System.out.println("Colocar pizza na caixa official PizzaStore");
    }

    public String getName(){
        return this.nome;
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("----" + this.nome + " ----\n");
        display.append(this.borda + "\n");
        display.append(this.molho + "\n");
        for(int i = 0; i< coberturas.size(); i++){
            display.append((String)coberturas.get(i) + "\n");
        }
        return display.toString();
    }
}
