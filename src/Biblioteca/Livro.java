package Biblioteca;

public class Livro implements Imprestavel{
    private String title;
    private String autor;
    private int bookId;
    private boolean isEmprestado;

    public Livro(String autor, String title) {
        this.autor = autor;
        this.title = title;
    }

    // public String getBookCode() {
    //     return bookCode;
    // }

    // public void setBookCode(String bookCode) {
    //     this.bookCode = bookCode;
    // }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getStatus() {
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

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "title: " + getTitle() + ", autor: " + getAutor();
    }

    @Override
    public void Emprestar(Usuario u) {
        // verificador -> isEmpprestado? sout"Ja emprestado" : ||
        boolean status = getStatus();
        if (status == true) {
            System.out.println("Livro ja emprestado");
        } else {
            setStatus(true);
            System.out.println("Livro emprestado com sucesso");
        }

    }

    @Override
    public void Devolver(){
        // verificador -> isEmprestado? || : sout"Impossivel devolver livro não emrpestsdo"
        if (getStatus() == false) {
        } else{
            setStatus(false);
        }
    }
}
