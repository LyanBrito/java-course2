package Car;

class Carro extends Veiculo {
    protected float velMedia = 80f;

    @Override
    public float calcularTempo(float distancia) {
        return distancia / this.velMedia;
    }

    public float getVelMedia() {
        return this.velMedia;
    }
}
