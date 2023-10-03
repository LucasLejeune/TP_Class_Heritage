package org.example.exercices.hotel;

import java.util.Random;

public class Chambre {

    Random rand = new Random();

    private String numero;
    private Boolean disponible;
    private int nb_lits = rand.nextInt(5);
    private double tarif;

    public Chambre(String numero, Boolean disponible, double tarif) {
        this.numero = numero;
        this.disponible = disponible;
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Chambre numero=" + numero + ", disponible=" + disponible + ", nombre de lits=" + nb_lits + ", tarif="
                + tarif
                + ".";
    }

    public String getNumero() {
        return numero;
    }

    public Boolean getDispo() {
        return disponible;
    }

    public int getNb_lits() {
        return nb_lits;
    }

    public double getTarif() {
        return tarif;
    }
}
