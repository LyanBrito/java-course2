package Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    static List<Livro> livros = new ArrayList<>();
    static List<Usuario> usuarios = new ArrayList<>();

    public static void addUsers(Usuario user) {
        usuarios.add(user);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livros.remove(livro);
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        livro.Emprestar(usuario);
    }


}
