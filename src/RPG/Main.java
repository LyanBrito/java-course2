package RPG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String classe = "";
        int nivel = 0;
        int vida = 0;

        PersonagemRpg P1 = new PersonagemRpg(nome, classe, nivel, vida);
        P1.setNome(nome);
        P1.setClasse(classe);
        P1.setNivel(nivel);
        P1.setVida(vida);

        nome = P1.getNome();
        classe = P1.getClasse();
        nivel = P1.getNivel();
        vida = P1.getVida();

        System.out.println("Esses são os dados do seu heroi: " +
                "Nome: " + nome + " Classe: " + classe + " Nivel: " + nivel + " Vida: " + vida);
    }
}
