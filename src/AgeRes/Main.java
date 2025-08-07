package AgeRes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        int idade = 0;

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        pessoa.setNome(nome);

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        pessoa.setIdade(idade);

        pessoa.getNome();
        pessoa.getIdade();
    }
}
