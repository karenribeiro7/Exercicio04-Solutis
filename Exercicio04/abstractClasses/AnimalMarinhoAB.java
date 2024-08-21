package Exercicio04.abstractClasses;

public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, 0);        
    }

    public abstract void nadar (int distancia);

    @Override
    public String toString() {
        return "AnimalMarinhoAB [altura=" + altura + ", habitat=" + habitat + ", idade=" + idade + ", nome=" + nome
                + ", peso=" + peso + ", tipoAnimal=" + tipoAnimal + "]";
    }
    
}
