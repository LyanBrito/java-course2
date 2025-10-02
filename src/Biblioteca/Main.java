package Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro l = new Livro("Lucas Uendél", "50 tons de cinza");
        Livro l1 = new Livro("ViCtor alvis", "50 QWERFTY cinza");
        Livro l2 = new Livro("Natalia ", "50 tons AWERFGHza");
        Livro novoLivro = new Livro(null, null);
        int id = 1;

        Biblioteca.addUsers(new Professor(id++, "Fiama", "fiama@professor.com"));
        Biblioteca.addUsers(new Professor(id++, "Lucas", "lucas@professor.com"));
        Biblioteca.addUsers(new Aluno(id++, "Erico", "eric@aluno.com"));
        Biblioteca.addUsers(new Aluno(id++, "Miguelito", "miguel@aluno.com"));

        Biblioteca.addLivros(l);
        Biblioteca.addLivros(l1);
        Biblioteca.addLivros(l2);

        System.out.println("Seja bem vindo ao sistema de biblioteca");
        System.out.println("\nO que deseja fazer agora?\n1 - Cadastrar Livro\n2 - Empréstimo\n3 - Devolução\n4 - Sair");

        int op = sc.nextInt();
        sc.nextLine();

        while (true) {

            switch (op) {
                case 1:
                    System.out.println("Digite o autor do Livro:");
                    novoLivro.setAutor(sc.nextLine());

                    System.out.println("Digite o nome do Livro");
                    System.out.println("\nO que deseja fazer agora?\n1 - Cadastrar Livro\n2 - Empréstimo\n3 - Devolução\n4 - Sair");
                    op = sc.nextInt();
                    sc.nextLine();

                    novoLivro.setTitle(sc.nextLine());
                    Biblioteca.addLivros(novoLivro);

                    for (Livro livro : Biblioteca.livros) {
                        System.out.println(livro);
                    }

                        System.out.println("\nO que deseja fazer agora?\n1 - Cadastrar Livro\n2 - Empréstimo\n3 - Devolução\n4 - Sair");
                    op = sc.nextInt();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Escolha um usuario:");

                    for (int i = 0; i < Biblioteca.usuarios.size(); i++) {
                        System.out.println("Usuario " + i + ": " + Biblioteca.usuarios.get(i));
                    }

                    int usuarioIndex = sc.nextInt();

                    Usuario usuario;
                    if (usuarioIndex >= 0 && usuarioIndex < Biblioteca.usuarios.size()) {
                        usuario = Biblioteca.usuarios.get(usuarioIndex);
                    } else {
                        System.out.println("Usuario invalido");
                        System.out.println("\nO que deseja fazer agora?\n1 - Cadastrar Livro\n2 - Empréstimo\n3 - Devolução\n4 - Sair");
                        op = sc.nextInt();
                        sc.nextLine();
                        break;
                    }

                    System.out.println("Qual livro deseja pegar emprestado?");
                    int i = 0;
                    for (Livro livro : Biblioteca.livros) {
                        System.out.println("Livro " + i + ": " + livro);
                        i++;
                    }
                    int index = sc.nextInt();
                    if (usuario.getUserEmprestimos(int emprestimos++) >= usuario.getLimiteEmprestimo()){
                        System.out.println("Limite de emprestimos atingido");
                        System.out.println("\nO que deseja fazer agora?\n1 - Cadastrar Livro\n2 - Empréstimo\n3 - Devolução\n4 - Sair");
                        op = sc.nextInt();
                        sc.nextLine();
                        break;
                    }

                    System.out.println("Livro " + index + ": " + Biblioteca.livros.get(index));
                    Biblioteca.emprestarLivro(Biblioteca.livros.get(index), usuario);
                        System.out.println("\nO que deseja fazer agora?\n1 - Cadastrar Livro\n2 - Empréstimo\n3 - Devolução\n4 - Sair");
                    op = sc.nextInt();
                    sc.nextLine();
                    break;

                case 3:
                    System.out.println("devolução");
                    break;
                case 4:
                    System.out.println("tchau");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalido pae");
            }
        }
    }
}
