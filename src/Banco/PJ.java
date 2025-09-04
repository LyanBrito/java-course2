package Banco;

public class PJ extends Conta {
    public PJ(int agencia, int numero, double saldo, String titular) {
        super(agencia, numero, saldo, titular);
    }

    @Override
    double calcularTarifaMensal() {
        return 20;
    }
    @Override
    public void sacar(double valor){
        super.sacar(exibirSaldo() + 1.5);
    }

}
