package Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        double price = 0, discount = 0, valueWD = 0;

        Product p1 = new Product(nome, price, discount);
        System.out.println("Digite o nome do Produto");
        nome = sc.nextLine();
        p1.setName(nome);
        System.out.println("Digite o valor do Produto");
        price = sc.nextDouble();
        p1.setPrice(price);
        System.out.println("Digite o desconto do Produto");
        discount = sc.nextDouble();
        p1.setDiscount(discount);

        valueWD = p1.getDiscount(discount);
        System.out.println("o valor do produto é " + valueWD);

    }
}
