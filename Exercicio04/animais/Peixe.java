package Exercicio04.animais;

import Exercicio04.abstractClasses.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    private int distanciaPercorrida;
    private int quantidadeComida;
    private int quantidadeDormida;

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
    super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    public int getDistanciaPercorrida() {
      return distanciaPercorrida;
    }

    public int getQuantidadeComida() {
      return quantidadeComida;
     }

     public int getQuantidadeDormida() {
      return quantidadeDormida;
    }

    @Override
    public void nadar(int distancia) {
      distanciaPercorrida += distancia;
      System.out.println("O peixe nadou " + distancia + " metros.");
    }

    @Override
    public void comer(int quantidade) {
        this.quantidadeComida += quantidade;
        System.out.println("O peixe comeu " + quantidade + " gramas de ração.");
    }

    @Override
    public void dormir(int horas) {
        this.quantidadeDormida += horas;
        System.out.println("O peixe dormiu " + horas + " horas.");
    }

    @Override
    public void mover(int distancia) {
        nadar(distancia);
    }
}
