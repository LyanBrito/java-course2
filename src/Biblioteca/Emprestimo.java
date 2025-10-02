package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    static List<Emprestimo> emprestimos = new ArrayList<>();
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
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

    public static List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public static void setDevolução(int emprestimosId) {
        emprestimos.remove(emprestimosId);
    }

    public static void setEmprestimos(Livro livro, Usuario usuario) {
        emprestimos.add(new Emprestimo(livro, usuario));
    }

}
