package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo{
    static List<Emprestimo> emprestimos = new ArrayList<>();
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    public static void Emrpestar(Livro livro, Usuario usuario) {
        emprestimos.add(new Emprestimo(livro, usuario));
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
