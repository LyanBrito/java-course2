package RPG;

import java.util.Scanner;

public class PersonagemRpg {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    Scanner sc = new Scanner(System.in);

    public PersonagemRpg(String nome, String classe, int nivel, int vida) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("Digite o nome do seu heroi: ");
        nome = sc.nextLine();
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        while (true) {
            System.out.println("Digite a classe do seu heroi: ");
            classe = sc.nextLine();
            if (classe.equalsIgnoreCase("Guerreiro") || classe.equalsIgnoreCase("Arqueiro") || classe.equalsIgnoreCase("Preto") || classe.equalsIgnoreCase("Mago")) {
                this.classe = classe;
                break;
            } else {
                System.out.println("Classe inválida");
            }

        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        System.out.println("Digite a nivel do seu heroi: ");
        nivel = sc.nextInt();
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        while (true) {
            System.out.println("Digite a vida do seu heroi: ");
            vida = sc.nextInt();
            if (vida < 0 || vida > 100) {
                System.out.println("Valor de vida inválido");

            } else {
                this.vida = vida;
                break;
            }
        }
    }
}
