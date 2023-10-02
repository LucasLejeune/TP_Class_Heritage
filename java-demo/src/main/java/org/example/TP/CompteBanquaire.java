package org.example.TP;

public class CompteBanquaire {
    private int num_compte;
    private float solde;
    private String nom_titulaire;

    public CompteBanquaire(float solde, int num_compte, String nom_titulaire) {
        this.num_compte = num_compte;
        this.solde = solde;
        this.nom_titulaire = nom_titulaire;
    }

    public void retirerArgent(float somme) {
        this.solde -= somme;
        System.out.println("Votre solde est maintenant de: " + this.solde);
    }

    public void deposerArgent(float somme) {
        this.solde += somme;
        System.out.println("Votre solde est maintenant de: " + this.solde);
    }

    public void afficherSolde() {
        System.out.println("Votre solde est actuellement de: " + this.solde);
    }

}
