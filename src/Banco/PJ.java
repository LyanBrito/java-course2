package Banco;

public class PJ extends Conta {
    public PJ(int agencia, int numero, int saldo, String titular) {
        super(agencia, numero, saldo, titular);
    }

    @Override
    double calcularTarifaMensal() {
        return 20;
    }

    @Override
    public void sacar(double valor) {

    }
}
