package ma.education.tp1.introduction.test;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {
    public static void main(String[] args) {
        Salle B = new Salle(20, "testNomB");
        System.out.println(B.id + " " + B.nom);
    }
}
