package org.example.TP;

public class Voiture implements Vehicule {
    @Override
    public void tournerDroite() {
        System.out.println("La voiture tourne à droite");
    }

    @Override
    public void tournerGauche() {
        System.out.println("La voiture tourne à gauche");
    }

    @Override
    public void accelerer() {
        System.out.println("La voiture accélère");
    }

    @Override
    public void ralentir() {
        System.out.println("La voiture ralentit");
    }
}
