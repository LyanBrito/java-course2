package Biblioteca;

public class Livro implements Imprestavel{
    private String title;
    private String autor;
    private boolean status;

    public Livro(String autor, boolean status, String title) {
        this.autor = autor;
        this.status = status;
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void Emprestar(){
    }

    @Override
    public void Emprestar(Usuario u) {
        this.status = false;
        System.out.println("Livro: " + this.title);
        System.out.println("Livro emprestado com sucesso!");
    }

    @Override
    public void Devolver(){
        this.status = true;
        System.out.println("Livro: " + this.title);
        System.out.println("Livro devolvido com sucesso!");
    }
}
