package Exercicio04.abstractClasses;

import Exercicio04.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    String nome;
    String tipoAnimal;
    int idade;
    String habitat;
    double altura;
    double peso;
    int quantidadeDePatas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeDePatas) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public abstract void comer(int quantidade);
    public abstract void mover(int distancia);
    public abstract void dormir(int horas);
    
}
