package JackPot;

public class Main {
    public static  void main(String[] args) {

        System.out.println("""
                JackPot!
                Symbols: 🍎🫐🍓🍒🍄🪺
                """);

        Roulet roulet = new Roulet();

        System.out.println(roulet.getValue());
//        roulet.validValues();

//      iniciar
    }
}
