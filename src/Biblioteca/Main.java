package Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao sistema de biblioteca");
        System.out.println("""
                O que Deseja fazer?
                1 - Cadastrar Livro ("Biblioteca.livro.add")
                2 - Cadastrar Pessoa ("Biblioteca.usuario.add")
                3 - Empréstimo (?????)
                4 - Sair
                """);
        int op = sc.nextInt();
        sc.nextLine();

        switch (op){
            case 1:

        }
    }
}
