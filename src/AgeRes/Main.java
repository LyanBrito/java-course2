package AgeRes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        pessoa.setIdade(idade);
        pessoa.setNome(nome);
        pessoa.getNome();
        pessoa.getIdade();
    }
}
