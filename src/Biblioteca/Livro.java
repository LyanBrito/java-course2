package Biblioteca;

public class Livro implements Imprestavel{
    private String title;
    private String autor;
    private boolean isEmprestado;

    public Livro(String autor, boolean isEmprestado, String title) {
        this.autor = autor;
        this.isEmprestado = isEmprestado;
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isStatus() {
        return isEmprestado;
    }

    public void setStatus(boolean isEmprestado) {
        this.isEmprestado = isEmprestado;
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
        this.isEmprestado = false;
        System.out.println("Livro: " + this.title);
        System.out.println("Livro emprestado com sucesso!");
    }

    @Override
    public void Devolver(){
        this.isEmprestado = true;
        System.out.println("Livro: " + this.title);
        System.out.println("Livro devolvido com sucesso!");
    }
}
