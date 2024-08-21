package Exercicio04.abstractClasses;

public abstract class AnimalVoadorAB extends AnimalAB {
    
    int quantidadeAsas;
    double envergaduraAsa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeDePatas, int quantidadeAsas, double envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeDePatas);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public abstract void voar (int distancia);

    @Override
    public String toString() {
        return "AnimalVoadorAB [altura=" + altura + ", envergaduraAsa=" + envergaduraAsa + ", habitat=" + habitat + ", idade=" + idade + ", nome=" + nome
                + ", peso=" + peso + ", quantidadeAsas=" + quantidadeAsas + ", quantidadeDePatas=" + quantidadeDePatas + ", tipoAnimal=" + tipoAnimal + "]";
    }
}
