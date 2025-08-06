package AgeRes;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        System.out.println(nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getIdade() {
        System.out.println(idade);
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("ta erardo");
        }
    }
}
