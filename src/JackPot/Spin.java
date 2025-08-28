package JackPot;

import java.util.Random;
import java.util.Scanner;

public class Spin {
    private String value;
    private int randValue;
    private String index1;
    private String index2;
    private String index3;
    private int saldo;
    Saldo s = new Saldo();
    Scanner sc = new Scanner(System.in);

    public int randIndex(int randValue) {
        Random rand = new Random();
        this.randValue = rand.nextInt(0, 5);
        return randValue;
    }

    public String spinIndex(String value) {
        randIndex(randValue);
        switch (randValue) {
            case 0:
                this.value = "\uD83C\uDF4E";
                break;
            case 1:
                this.value = "\uD83E\uDED0";
                break;
            case 2:
                this.value = "\uD83C\uDF53";
                break;
            case 3:
                this.value = "\uD83C\uDF52";
                break;
            case 4:
                this.value = "\uD83C\uDF44";
                break;
            case 5:
                this.value = "\uD83E\uDEBA";
                break;
        }
        return this.value;
    }

    public String getValue() {
        return index1 + index2 + index3;
    }

    public void setValues() {
        this.index1 = spinIndex(value);
        this.index2 = spinIndex(value);
        this.index3 = spinIndex(value);
    }


    public void validValues() {
        setValues();
        s.setSaldo(this.saldo);
        System.out.println("saldo: " + s.getSaldo());
        saldo = s.getSaldo();
        int aposta = s.Aposta();
        System.out.println(getValue());

        if (this.index1.equals(this.index2) && this.index2.equals(this.index3)) {
            System.out.println("JackPot!!!");
            this.saldo = saldo + (aposta * 3);
            System.out.println("Seu saldo: " + saldo);
        } else if (this.index1.equals(this.index2) || this.index2.equals(this.index3) || this.index1.equals(this.index3)) {
            System.out.println("Double!!");
            this.saldo = saldo + (aposta * 2);
            System.out.println("Seu saldo: " + saldo);
        } else {
            System.out.println("Perdeu :(");
            this.saldo = saldo - aposta;
            System.out.println("Seu saldo: " + this.saldo);
        }

    }

    public void validLoop() {
        this.saldo = 100;
        String res;
        do {
            validValues();
            if (saldo <= 0) {
                System.out.println("saldo insuficiente, perdeu mané");
                break;
            } else {
                System.out.println("Continuar? (S/N)");
                res = sc.nextLine();

            }

        } while (res.equalsIgnoreCase("S"));
    }

}
