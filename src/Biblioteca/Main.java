package Biblioteca;

import java.util.Iterator;
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

        while (true) {
            System.out.println("\nO que deseja fazer agora?\n1 - Cadastrar Livro\n2 - Empréstimo\n3 - Devolução\n4 - Ver Livros\n5 - Ver Empréstimos\n6 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite o autor do Livro:");
                    novoLivro.setAutor(sc.nextLine());

                    System.out.println("Digite o nome do Livro");
                    novoLivro.setTitle(sc.nextLine());
                    Biblioteca.addLivros(novoLivro);

                    for (Livro livro : Biblioteca.livros) {
                        System.out.println(livro);
                    }
                    break;
                case 2:
                    Usuario usuario;
                    System.out.println("Escolha um usuario:");
                    for (int i = 0; i < Biblioteca.usuarios.size(); i++) {
                        System.out.println("Usuario " + i + ": " + Biblioteca.usuarios.get(i));
                    }
                    int usuarioIndex = sc.nextInt();

                    if (usuarioIndex >= 0 && usuarioIndex < Biblioteca.usuarios.size()) {
                        usuario = Biblioteca.usuarios.get(usuarioIndex);
                    } else {
                        System.out.println("Usuario invalido");
                        break;
                    }

                    System.out.println("Qual livro deseja pegar emprestado?");
                    int i = 0;
                    for (Livro livro : Biblioteca.livros) {
                        System.out.println("Livro " + i + ": " + livro);
                        i++;
                    }
                    int index = sc.nextInt();
                    int emprestimos = 0;
                    if (usuario.getUserEmprestimos() >= usuario.getLimiteEmprestimo()) {
                        System.out.println("Limite de emprestimos atingido");
                        break;
                    }
                    usuario.setUserEmprestimos();
                    System.out.println("Livro " + index + ": " + Biblioteca.livros.get(index));
                    Biblioteca.emprestarLivro(Biblioteca.livros.get(index), usuario);

                    break;

                case 3:
                    System.out.println("Selecione o livro que deseja devolver:");
//                    System.out.println("Livros:");
//                    for (Livro livro : Biblioteca.livros) {
//                        System.out.println(livro);
//                    }
                    for (Usuario user : Biblioteca.usuarios) {
                         for (Emprestimo emprestimo : Emprestimo.emprestimos) {
                                if (emprestimo.getUsuario().equals(user)) {
                                    System.out.print("\n \t"+ emprestimo.getLivro().getBookId() + emprestimo.getLivro() + "\n");
                                }
                            }
                        }


//                    printar os livros emprestados e não todos
                    int livroIndex = sc.nextInt();
                    boolean livroEncontrado = false;
                    for (int j = 0; j < Biblioteca.livros.size(); j++) {
                        Livro livro = Biblioteca.livros.get(j);
                        if (livro.getBookId() == livroIndex) {
                            for (int k = Emprestimo.emprestimos.size() - 1; k >= 0; k--) {
                                Emprestimo emprestimo = Emprestimo.emprestimos.get(k);
                                if (emprestimo.getLivro().equals(livro)) {
                                    Emprestimo.setDevolução(livroIndex);
                                    livro.Devolver();
                                    livroEncontrado = true;
                                    System.out.println("Livro devolvido com sucesso!");
                                    break;
                                }
                            }
                            if (livroEncontrado) break;
                        }
                    }

                    if (!livroEncontrado) {
                        System.out.println("Livro não encontrado ou não está emprestado.");
                    }
                    break;

                case 4:
                    System.out.println("Livros:");
                    for (Livro livro : Biblioteca.livros) {
                        System.out.println(livro);
                    }
                    break;
                case 5:
                    System.out.println("Livros emprestados:");
                    for (Usuario user : Biblioteca.usuarios) {
                        if (user.getUserEmprestimos() == 0) {
                            System.out.print(user.getNome() + ": não possui emprestimos\n");
                        } else {
                            System.out.print(user.getNome() + ": ");
                            for (Emprestimo emprestimo : Emprestimo.emprestimos) {
                                if (emprestimo.getUsuario().equals(user)) {
                                    System.out.print("\n \t" + emprestimo.getLivro() + "\n");
                                }
                            }
                        }
                    }

                    break;

                case 6:
                    System.out.println("Saindo . . .");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalido pae");
            }
        }
    }
}
