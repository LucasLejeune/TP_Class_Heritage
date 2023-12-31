package org.example;

import org.example.array.Array;
import org.example.exercices.*;
import org.example.generique.Boite;
import org.example.operator.Operator;
import org.example.poo.Phone;
import org.example.poo.Product;
import org.example.poo.statique.User;
import org.example.readFromConsole.ReadFromConsole;
import org.example.string.ChaineCaractere;
import org.example.structure.Structure;
import org.example.structure.Structure2;
import org.example.variable.Variable;
import org.example.generique.Boite;
import org.example.generique.Hangar;
import org.example.TP.Vehicule;
import org.example.TP.Voiture;
import org.example.TP.Moto;

import java.util.concurrent.Callable;

public class Main {

  public static void main(String[] args) {

    // Variable.getVariable();
    // Operator.getOperator();
    // Operator.getExepressionType();
    // Operator.getOperatorAndComparaison();
    // Structure.getSwitch();
    // ReadFromConsole.getReadWrite();
    // Exo1.getExercice3();3
    // Structure2.getBoucleFor();
    // Structure2.getDoWhile();
    // Structure2.getBreakAndContinue();
    // Exo1.getExercice8();

    // ChaineCaractere.getMethodString();
    // ChaineCaractere.getComparaisonString();
    // ChaineCaractere.getFormat();
    // Array.getArray();
    // Exo3.getDecalage();
    // Exo3.exo3();
    // ExoString.getNbMots();
    /*
     * Product product = new Product();
     * System.out.println(product);
     * Product product1 = new Product(5, "telephone");
     * System.out.println(product1);
     * product1.setId(15);
     * System.out.println(product1);
     * System.out.println("le nom du produit est " + product1.getNom());
     * product1.quiSuisJe();
     * Product.getBonjour();
     */

    /*
     * Phone phone1 = new Phone(5,"iphone2",255);
     * // System.out.println(phone1.getPrix());
     * System.out.println(phone1);
     * phone1.quiSuisjee();
     * Phone.getBonjour();
     */

    User user = new User();
    user.setName("Thomas");
    User user1 = new User("Michel");
    User user2 = new User("Tom");
    // System.out.println(user);
    // System.out.println(user1);
    // System.out.println(user2);

    // enum JourSemaine {
    // LUNDI, MARDI, MERCREDI
    // }

    // JourSemaine today = JourSemaine.LUNDI;

    DayWeek tomorrow = DayWeek.JEUDI;

    Boite<String> stringBoite = new Boite<String>("TOTO");
    Boite<User> userBoite = new Boite<User>(user1);

    // System.out.println(stringBoite.getContenu());
    // System.out.println(userBoite.getContenu());

    Moto moto = new Moto();
    Voiture voiture = new Voiture();

    Hangar<Vehicule> hangar = new Hangar<Vehicule>();

    hangar.addElement(voiture);
    hangar.addElement(moto);

    System.out.println(hangar.getAll());

  }
}