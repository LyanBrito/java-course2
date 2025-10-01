package Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro l = new Livro("Lucas Uendél", "50 tons de cinza");
        Livro l1 = new Livro("ViCtor alvis", "50 QWERFTY cinza");
        Livro l2 = new Livro("Natalia ", "50 tons AWERFGHza");

        int id = 1;

        Biblioteca.addUsers(new Professor(id++, "Fiama", "fiama@professor.com"));
        Biblioteca.addUsers(new Professor(id++, "Lucas", "lucas@professor.com"));
        Biblioteca.addUsers(new Aluno(id++, "Erico", "eric@aluno.com"));
        Biblioteca.addUsers(new Aluno(id++, "Miguelito", "miguel@aluno.com"));


        System.out.println("Seja bem vindo ao sistema de biblioteca");
        System.out.println("""
                0 que Deseja fazer?
                1 - Cadastrar Livro ("Biblioteca.livro.add")
                2 - Empréstimo (?????)
                3 - Sair
                """);
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:

        }
    }
}

