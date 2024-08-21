package Exercicio04;

import Exercicio04.animais.Cachorro;
import Exercicio04.animais.Elefante;
import Exercicio04.animais.Gato;
import Exercicio04.animais.Leao;
import Exercicio04.animais.Peixe;
import Exercicio04.animais.Pombo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Hachiko", "Terrestre", 5, "Casa", 0.5, 5, 4);
        Gato gato = new Gato("Nana", "Terrestre", 3, "Casa", 0.3, 3, 4);
        Elefante elefante = new Elefante("Nino", "Terrestre", 10, "Savana", 3, 3000, 4);
        Peixe peixe = new Peixe("Dory", "Marinho", 1, "Mar", 0.1, 0.1);
        Leao leao = new Leao("Nala", "Terrestre", 7, "Savana", 1.5, 150, 4);
        Pombo pombo = new Pombo("Elton", "Voador", 2, "Cidade", 0.2, 0.2, 2, 2, 0.5);

        cachorro.comer(2);
        cachorro.mover(10);
        cachorro.dormir(8);

        System.out.println("-----------------------");

        gato.comer(1);
        gato.mover(5);
        gato.dormir(10);

        System.out.println("-----------------------");

        elefante.comer(50);
        elefante.mover(20);
        elefante.dormir(12);

        System.out.println("-----------------------");

        peixe.comer(1);
        peixe.mover(2);
        peixe.dormir(2);

        System.out.println("-----------------------");

        leao.comer(10);
        leao.mover(15);
        leao.dormir(10);

        System.out.println("-----------------------");

        pombo.comer(1);
        pombo.mover(5);
        pombo.dormir(8);
        
        System.out.println("-----------------------");

        System.out.println(cachorro.toString());
        System.out.println(gato.toString());
        System.out.println(elefante.toString());
        System.out.println(leao.toString());
        System.out.println(peixe.toString());
        System.out.println(pombo.toString());
        
    }
}
