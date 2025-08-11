package Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String autor = "";
        int pageNum = 0;

        Livro livro = new Livro();
        livro.setName(name);
        livro.setAutor(autor);
        livro.setPageNum(pageNum);

        name = livro.getName();
        autor = livro.getAutor();
        pageNum = livro.getPageNum();

        System.out.println("Livro: " +
                "Nome: " + name
                + ", Autor: " + autor
                + ", Numero de Paginas: " + pageNum);
    }
}
