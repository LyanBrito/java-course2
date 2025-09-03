package Banco;

abstract class Conta {
    private int numero;
    private int agencia;
    private String titular;
    private int saldo;

    public Conta(int agencia, int numero, int saldo, String titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public int exibirSaldo(){
        return this.saldo;
    }
    abstract double calcularTarifaMensal();
}
