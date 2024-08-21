package Exercicio04.animais;

import Exercicio04.abstractClasses.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {
    private int distanciaPercorrida;
    private int quantidadeComida;
    private int quantidadeDormida;

    public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeDePatas);
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int quantidadePercorrida) {
        this.distanciaPercorrida = quantidadePercorrida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getQuantidadeDormida() {
        return quantidadeDormida;
    }

    public void setQuantidadeDormida(int quantidadeDormida) {
        this.quantidadeDormida = quantidadeDormida;
    }

    @Override
    public void comer(int quantidade) {
        this.quantidadeComida += quantidade;
        System.out.println("O gato comeu " + quantidade + " gramas de ração.");
    }

    @Override
    public void mover(int distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println("O gato andou " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        this.quantidadeDormida += horas;
        System.out.println("O gato dormiu " + horas + " horas.");
    }
}
