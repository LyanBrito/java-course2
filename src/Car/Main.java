package Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("vai tomando");

        Carro  nissan = new Carro();
        Bicicleta monark = new Bicicleta();
        Onibus mercedes = new Onibus();
        Veiculo veiculo = new Veiculo();

        Veiculo[] veiculos = {nissan, monark, mercedes};

        veiculo.calcularCem(veiculos);

    }
}
