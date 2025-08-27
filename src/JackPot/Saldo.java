package JackPot;

import java.util.Scanner;

public class Saldo {
    private int saldo;
    private int aposta;


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public int Aposta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto quer apostar?");
        this.aposta = sc.nextInt();
        sc.nextLine();

        return aposta;
    }

}
