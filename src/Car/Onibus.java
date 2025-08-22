package Car;

class Onibus extends Veiculo {
    protected float velMedia = 60f;
    protected float numParadas = 10f;

    @Override
    public float calcularTempo(float distancia) {
        return (distancia / this.velMedia) + (0.25f * numParadas);
    }

    public float getVelMedia() {
        return this.velMedia;
    }
}
