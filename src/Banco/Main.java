package Banco;

import java.util.Scanner;

public class Main {
    public static void setConta(Conta conta) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                O que  deseja fazer?
                1 - Analisar Saldo
                2 - Realizar Saque
                3 - Deposito
                4 - Sair
                """);
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Saldo Atual: " + conta.getSaldo());
                break;
            case 2:
                System.out.println("Valor do Saque: ");
                double valorSaque = sc.nextDouble();
                conta.sacar(valorSaque);
                break;
            case 3:
                System.out.println("Valor do Deposito: ");
                double valorDeposito = sc.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 4:
                System.out.println("Saindo . . .");
                break;
            default:
                System.out.println("Opção errada!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cc = new CC(002, 2, 3000, "Buceta");
        Conta pc = new PC(003, 6, 1500, "Papai");
        Conta pj = new PJ(004, 5, 4000, "Batata");


        while (true) {
            System.out.println("""
                    O que deseja fazer?
                    1 - Analisar Conta Corrente
                    2 - Analisar Conta Poupança
                    3 - Analisar Conta Pessoa Juridica
                    4 - Sair
                    """);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    setConta(cc);
                case 2:
                    setConta(pc);
                case 3:
                    setConta(pj);
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }
    }
}
