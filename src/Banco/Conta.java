package Banco;

abstract class Conta {
    private int numero;
    private int agencia;
    private String titular;
    private double saldo;

    public Conta(int agencia, int numero, double saldo, String titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(getSaldo() - valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract double calcularTarifaMensal();

}

