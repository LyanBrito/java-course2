package Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    static List<Livro> livros = new ArrayList<>();
    static List<Usuario> usuarios = new ArrayList<>();

    public static void addUsers(Usuario user) {
        usuarios.add(user);
    }

    public static void addLivros(Livro livro) {
        livros.add(livro);
    }

    public static void removeLivros(Livro livro){
        livros.remove(livro);
    }

    public static void emprestarLivro(Livro livro, Usuario usuario) {
        livro.Emprestar(usuario);
        Emprestimo.setEmprestimos(livro, usuario);
    }
}
