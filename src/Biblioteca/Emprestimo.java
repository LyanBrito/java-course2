package Biblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    static List<Emprestimo> emprestimos = new ArrayList<>();
    private Livro livro;
    private Usuario usuario;
    private LocalDateTime dataEmprestimo = LocalDateTime.now();
    private LocalDateTime dataDevolucao = dataEmprestimo.plusDays(3);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

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

    public String getDataEmprestimo() {
        String formattedDate = dataEmprestimo.format(formatter);
        return formattedDate;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        String formattedDate = dataDevolucao.format(formatter);
        return formattedDate;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
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
