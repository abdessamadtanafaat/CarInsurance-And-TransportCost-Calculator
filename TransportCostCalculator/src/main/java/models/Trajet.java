package models;

import java.time.LocalDate;

public class Trajet implements AbsMission {
    private String depart;
    private String arrivee;
    private LocalDate dateDepart;
    private LocalDate dateArrivee;
    private double cout;

    public Trajet(String depart, String arrivee, LocalDate dateDepart, LocalDate dateArrivee, double cout) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.cout = cout;
    }

    @Override
    public double calculerCout() {
        return cout;
    }

    @Override
    public void view() {
        System.out.println("Trajet de " + depart + " à " + arrivee + ", Coût : " + cout);
    }
}
