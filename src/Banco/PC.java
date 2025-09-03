package Banco;

public class PC extends Conta {
    public PC(int agencia, int numero, int saldo, String titular) {
        super(agencia, numero, saldo, titular);
    }

    @Override
    double calcularTarifaMensal() {
        return 0;
    }
}
