package Livro;

import java.util.Scanner;

public class Livro {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String autor;
    private int pageNum;

    public void setName(String name) {
        System.out.println("Digite o nome do livro");
        name = sc.nextLine();
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAutor(String autor) {
        System.out.println("Digite autor do livro");
        autor = sc.nextLine();
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setPageNum(int pageNum) {
        while (pageNum < 5) {
            System.out.println("Digite o ano do livro");
            pageNum = sc.nextInt();
            if (pageNum < 5) {
                System.out.println("ta erardo fih");
            } else {
                this.pageNum = pageNum;
                break;
            }

        }

    }
    public int getPageNum() {
        return pageNum;
    }
}
