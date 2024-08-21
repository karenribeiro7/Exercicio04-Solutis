package Exercicio04.animais;

import Exercicio04.abstractClasses.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    private int distanciaPercorrida;
    private int quantidadeComida;
    private int quantidadeDormida;

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeDePatas);
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
    public void comer(int quantidade) {
        this.quantidadeComida += quantidade;
        System.out.println("O elefante comeu " + quantidade + " kg de capim.");
    }


    @Override
    public void mover(int distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println("O elefante andou " + distancia + " metros.");
    }


    @Override
    public void dormir(int horas) {
        this.quantidadeDormida += horas;
        System.out.println("O elefante dormiu " + horas + " horas.");
    }
}
