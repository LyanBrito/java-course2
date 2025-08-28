package CacheDB;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        nome = sc.nextLine();
        this.nome = nome;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa: ");
        idade = sc.nextInt();
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id da pessoa: ");
        id = sc.nextInt();
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", id=" + id + '}';
    }

    public void setPessoa(ArrayList<Pessoa> cache) {
        Scanner sc = new Scanner(System.in);
        setNome(nome);
        setIdade(idade);
        setId(id);
        cache.add(new Pessoa(getNome(), getIdade(), getId()));

    }

    public String validaCache(ArrayList<Pessoa> cache, ArrayList<Pessoa> bd) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do registro que deseja visualizar: ");
        int op = sc.nextInt();
        sc.nextLine();

        System.out.println("Verificando o Cache ...");
        if (cache.isEmpty()) {
            System.out.println("Cache vazio, verificando a Base de Dados ...");
            for (Pessoa pessoa : bd) {
                if (pessoa.getId() == bd.get(op - 1).getId()) {
                    System.out.println("Registro encontrado!");
                    return bd.get(op - 1).toString();
                } else {
                    setPessoa(cache);
                    return cache.get(op - 1).toString();
                }
            }
        } else {
            for (Pessoa p : cache) {
                if (p.getId() == cache.get(op - 1).getId()) {
                    System.out.println("Registro encontrado");
                    return cache.get(op - 1).toString();
                }
            }
        }
        return "Pessao não encontrada";
    }
}

//        if (cache.isEmpty()) {
//            System.out.println("Nao tem nenhum registro");
//            System.out.println("Verificando a Base de Dados");
//            if ((op - 1) == setId2(bd, op)) {
//                System.out.println("Registro encontrado");
//                System.out.println(bd.get(op - 1).toString());
//            } else {
//            }
//
//        } else {
//            System.out.println("Registro encontrado");
//            System.out.println(cache.get(op - 1).toString());
//            return;

