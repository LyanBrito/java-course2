package CacheDB;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int idade;
    private int id;

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Id: " + id + "\n";
    }

    public Pessoa setPessoa() {
        int newId = 6;

        System.out.println("Digite o nome da pessoa: ");
        this.nome = sc.next();
        sc.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        this.idade = sc.nextInt();
        sc.nextLine();

        setId(newId++);
        return new Pessoa(getNome(), getIdade(), getId());

    }

    public String validaCache(ArrayList<Pessoa> bd, ArrayList<Pessoa> cache) {
        System.out.println("Digite o id do registro que deseja visualizar: ");
        int op = sc.nextInt();
        sc.nextLine();

        for (Pessoa value : cache) {
            if (op == value.getId()) {
                System.out.println("Registro encontrado no cache!");
                return "Nome: " + value.getNome() + ", Idade: " + value.getIdade();
            }
        }
        for (Pessoa pessoa : bd) {
            if (op == pessoa.getId()) {
                System.out.println("Registro encontrado!");
                cache.add(bd.get(op - 1));
                if (cache.size() > 10) {
                    cache.removeFirst();
                }
                return "Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade();
            }
        }
        return "Pessoa não encontrada";
    }

    public void loop(ArrayList<Pessoa> cache, ArrayList<Pessoa> bd) {
        int op;
        while (true) {
            System.out.println("""
                    O que deseja fazer?
                    1 - Cadastrar novo usuário
                    2 - Consultar usuário por id
                    3 - Consultar Cache
                    4 - Sair
                    """);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    bd.add(setPessoa());
                    break;
                case 2:
                    System.out.println(bd.getFirst().validaCache(bd, cache));
                    break;
                case 3:
                    System.out.println(cache.toString());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("valor inválido");
                    break;
            }
        }

    }
}
