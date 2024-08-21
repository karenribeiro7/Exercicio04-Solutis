package Exercicio04.abstractClasses;

public abstract class AnimalTerrestreAB extends AnimalAB {    
    
    
    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeDePatas);
    }

    @Override
    public String toString() {
        return "AnimalTerrestreAB [altura=" + altura + ", habitat=" + habitat + ", idade=" + idade + ", nome=" + nome
                + ", peso=" + peso + ", quantidadeDePatas=" + quantidadeDePatas + ", tipoAnimal=" + tipoAnimal + "]";
    }
}
