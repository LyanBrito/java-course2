package CacheDB;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int idade;
        String nome;
        int id;
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa(null, 0, 0);
        ArrayList<Pessoa> bd = new ArrayList<>();
        ArrayList<Pessoa> cache = new ArrayList<>();

        bd.add(new Pessoa("Lyan", 19, 1));
        bd.add(new Pessoa("João", 18, 2));
        bd.add(new Pessoa("Rhaul", 17, 3));
        bd.add(new Pessoa("Dudu", 25, 4));
        bd.add(new Pessoa("Lucas", 22, 5));


//        p.validaCache(cache, op , bd);
//        p.validaId(bd, sc, op);
        System.out.println(p.validaCache(cache, bd));

    }
}
