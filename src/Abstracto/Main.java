package Abstracto;

public class Main {
    public static void main(String[] args) {
        Comida bife = new HorseBiff();
        Comida doce = new Mugunza();

        System.out.println(bife.sendDish());
        System.out.println(doce.sendDish());


    }
}
