package org.example.exercices.hotel;

import java.util.ArrayList;
import java.util.Random;

public class Hotel {
    Random rand = new Random();
    private String nom;
    private ArrayList<Client> listeClients = new ArrayList<Client>();
    private ArrayList<Chambre> listeChambres = new ArrayList<Chambre>();
    private ArrayList<Reservation> listeReservation = new ArrayList<Reservation>();

    public Hotel(String nom) {
        this.nom = nom;
        for (int i = 0; i < rand.nextInt(100) + 1; i++) {
            this.listeChambres.add(new Chambre("" + i, true, rand.nextInt(100) + rand.nextDouble()));
        }
    }

    public ArrayList<Chambre> getListeChambres() {
        return listeChambres;
    }

    public void addClient(Client client) {
        this.listeClients.add(client);
    }

    public void addReservation(Reservation reservation) {
        this.listeReservation.add(reservation);
    }

    public ArrayList<Chambre> getChambreDispo(int nbChambres) {
        int temp = nbChambres;
        ArrayList<Chambre> listeChambresDispo = new ArrayList<Chambre>();
        for (Chambre chambre : listeChambres) {
            if (chambre.getDispo() == true && temp > 0) {
                listeChambresDispo.add(chambre);
                --temp;
            }
        }

        if (temp != 0) {
            temp = nbChambres - temp;
            System.out.println("Pas assez de chambres disponibles la réservation comprend donc " + temp + " chambres");
        }

        return listeChambresDispo;
    }

    public ArrayList<Reservation> getReservations() {
        return listeReservation;
    }
}
