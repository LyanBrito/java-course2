package Biblioteca;

import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    public void devolverLivro(Livro livro){
        this.livros.remove(livro);
    }
    public void emprestarLivro(Livro livro, Usuario usuario){
        livro.Emprestar(usuario);
    }
}
