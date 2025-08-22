package Car;

public class Veiculo {
    protected String veiculo;
    protected int velMedia;
    protected float distancia;

    public float getDistancia() {
        return distancia;
    }

    public float getVelMedia() {
        return velMedia;
    }
    public float calcularTempo(float distancia) {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public String getVeiculo() {
        return veiculo;
    }
    public void calcularCem(Veiculo[] veiculo){
        float bikeTime = 100 / veiculo[0].getVelMedia();
        float carTime = 100 / veiculo[1].getVelMedia();
        float busTime = 100 / veiculo[2].getVelMedia();

        System.out.println("BikeTime: " + bikeTime);
        System.out.println("CarTime: " + carTime);
        System.out.println("BusTime: " + busTime);

    }

}
