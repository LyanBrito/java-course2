package interfaces;

public class Pessoa  extends SerVivo implements Coracao, Rim{
    @Override
    public void bater() {
        System.out.println("Bater");
    }

    @Override
    public void filtro() {
        System.out.println("Filtrar");
    }
}
