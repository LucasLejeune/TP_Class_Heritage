package org.example.TP;

public class Moto implements Vehicule {
    @Override
    public void tournerDroite() {
        System.out.println("La moto tourne à droite");
    }

    @Override
    public void tournerGauche() {
        System.out.println("La moto tourne à gauche");
    }

    @Override
    public void accelerer() {
        System.out.println("La moto accélère");
    }

    @Override
    public void ralentir() {
        System.out.println("La moto ralentit");
    }
}
