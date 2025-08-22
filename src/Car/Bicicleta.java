package Car;

class Bicicleta extends Veiculo {
    protected float velMedia = 20f;

    @Override
    public float calcularTempo(float distancia) {
        return distancia / this.velMedia;
    }

    public float getVelMedia() {
        return this.velMedia;
    }

}
