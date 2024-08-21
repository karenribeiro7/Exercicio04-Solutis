package Exercicio04.animais;

import Exercicio04.abstractClasses.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    private int distanciaPercorrida;
    private int quantidadeComida;
    private int quantidadeDormida;

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, int quantidadeAsas, double envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas, quantidadeAsas, envergaduraAsa);
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
    public void voar(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println("O pombo voou " + distancia + " metros.");
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
        System.out.println("O pombo comeu " + quantidade + " gramas de ração.");
    }

    @Override
    public void dormir(int horas) {
        quantidadeDormida += horas;
        System.out.println("O pombo dormiu " + horas + " horas.");
    }
    
    @Override
    public void mover(int distancia) {
        voar(distancia);
    }    
}
