package org.example.liste;

import java.util.ArrayList;
import org.example.generique.Hangar;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> prenoms = new ArrayList<String>();
        prenoms.add("Patrick");
        prenoms.add("Bob");
        prenoms.add("Carlos");

        // System.out.println(prenoms.get(0));
        // System.out.println(prenoms.get(1));
        // System.out.println(prenoms.get(2));

        prenoms.set(0, "Sandy");
        // System.out.println(prenoms.get(0));

        // System.out.println("Taille de la liste: " + prenoms.size());

        prenoms.remove(2);
        // System.out.println("Taille de la liste: " + prenoms.size());
        // for (String prenom : prenoms) {
        // System.out.println(prenom);
        // }

    }
}
