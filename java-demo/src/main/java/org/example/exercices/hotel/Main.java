package org.example.exercices.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nommer l'hôtel: ");
        String nomHotel = myObj.nextLine();

        Hotel hotel = new Hotel(nomHotel);

        System.out.println("Voulez-vous faire une réservation ? [O/N]");
        String reservationBool = myObj.nextLine();

        while (!reservationBool.equals("O") && !reservationBool.equals("o") && !reservationBool.equals("N")
                && !reservationBool.equals("n")) {
            System.out.println("Erreur de saisie.");
            System.out.println("Voulez-vous faire une réservation ? [O/N]");
            reservationBool = myObj.nextLine();
        }

        if (reservationBool.equals("O") || reservationBool.equals("o")) {
            System.out.println("Quel est le nom du client:");
            String nomClient = myObj.nextLine();
            System.out.println("Quel est le prenom du client:");
            String prenomClient = myObj.nextLine();
            System.out.println("Quel est le numéro de téléphone du client:");
            String telephoneClient = myObj.nextLine();

            Client client = new Client(nomClient, prenomClient, telephoneClient);

            hotel.addClient(client);

            System.out.println("Combien de chambres souhaitez-vous réserver ?");
            int nbChambres = myObj.nextInt();

            System.out.println("Souhaitez-vous payer en ligne [L] ou sur place [P] ?");
            String statusRes = myObj.nextLine();

            while (!statusRes.equals("L") && !statusRes.equals("l") && !statusRes.equals("P")
                    && !statusRes.equals("p")) {
                System.out.println(statusRes);
                System.out.println("Erreur de saisie.");
                System.out.println("Souhaitez-vous payer en ligne [L] ou sur place [P] ?");
                statusRes = myObj.nextLine();
            }

            if (statusRes.equals("L") || statusRes.equals("l")) {
                statusRes = "Paiement en ligne";
            } else {
                statusRes = "Paiement sur place";
            }

            ArrayList<Chambre> chambresDispos = hotel.getChambreDispo(nbChambres);

            Reservation reservation = new Reservation(telephoneClient, client, chambresDispos);

            hotel.addReservation(reservation);

            for (Reservation res : hotel.getReservations()) {
                System.out.println(res.getListeChambres());
            }

        } else {
            System.exit(0);
        }
    }
}
