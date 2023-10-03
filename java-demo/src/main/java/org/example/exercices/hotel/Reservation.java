package org.example.exercices.hotel;

import java.util.ArrayList;

public class Reservation {
    private int id;
    private String status;
    private ArrayList<Chambre> listeChambres = new ArrayList<Chambre>();
    private Client client;

    public Reservation(String status, Client client, ArrayList<Chambre> listeChambres) {
        ++id;
        this.status = status;
        this.client = client;
        this.listeChambres = listeChambres;
    }

    @Override
    public String toString() {
        return "Reservation numero" + id + ", status=" + status + ", liste des Chambres=" + listeChambres + ", client="
                + client + "]";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Chambre> getListeChambres() {
        return listeChambres;
    }

    public Client getClient() {
        return client;
    }
}
