package Banco;

public class CC extends Conta {
    public CC(int agencia, int numero, int saldo, String titular) {
        super(agencia, numero, saldo, titular);
    }

    @Override
    double calcularTarifaMensal() {
        return 12;
    }
}
