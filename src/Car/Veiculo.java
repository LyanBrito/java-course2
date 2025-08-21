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
    public float calcularTempo(float velMedia) {
        return  distancia/velMedia;
    }


}
