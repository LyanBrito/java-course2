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
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract double calcularTarifaMensal();

}

