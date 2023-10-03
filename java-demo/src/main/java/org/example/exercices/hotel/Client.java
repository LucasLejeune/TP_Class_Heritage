package org.example.exercices.hotel;

import java.util.ArrayList;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;

    public Client(String nom, String prenom, String telephone) {
        ++id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }
}
