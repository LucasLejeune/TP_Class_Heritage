package org.example.TP;

public class Main {
    public static void main(String[] args) {
        CompteBanquaire compte = new CompteBanquaire(3000, 12, "lucas");
        compte.deposerArgent(500);
        compte.retirerArgent(300);
        compte.afficherSolde();

        Moto moto = new Moto();
        moto.accelerer();
        moto.ralentir();
        moto.tournerDroite();
        moto.tournerGauche();

        Voiture voiture = new Voiture();
        voiture.accelerer();
        voiture.ralentir();
        voiture.tournerDroite();
        voiture.tournerGauche();

    }

}
