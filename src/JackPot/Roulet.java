package JackPot;

import java.util.Random;

public class Roulet {
    private String value;
    private int randValue;
    private String index1;
    private String index2;
    private String index3;

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
        return value;
    }

    public void setValues() {
        this.value = spinIndex(this.value);
        this.index1 = spinIndex(value);
        this.index2 = spinIndex(value);
        this.index3 = spinIndex(value);
    }

    public String getValue() {
        setValues();
        return this.index1 + this.index2 + this.index3;
    }

    public void validValues() {
        setValues();
        if (this.index1.equals(this.index2) && this.index2.equals(this.index3)) {
            System.out.println("ganhou 3");
        } else if (this.index1.equals(this.index2) || this.index2.equals(this.index3) || this.index1.equals(this.index3)) {
            System.out.println("ganhou 2");
        } else {
            System.out.println("perdeu fih");

        }

    }
}
