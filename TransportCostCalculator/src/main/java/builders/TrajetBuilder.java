package builder;

import models.Trajet;
import java.time.LocalDate;

public class TrajetBuilder {
    private String depart;
    private String arrivee;
    private LocalDate dateDepart;
    private LocalDate dateArrivee;
    private double cout;

    public TrajetBuilder setDepart(String depart) {
        this.depart = depart;
        return this;
    }

    public TrajetBuilder setArrivee(String arrivee) {
        this.arrivee = arrivee;
        return this;
    }

    public TrajetBuilder setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
        return this;
    }

    public TrajetBuilder setDateArrivee(LocalDate dateArrivee) {
        this.dateArrivee = dateArrivee;
        return this;
    }

    public TrajetBuilder setCout(double cout) {
        this.cout = cout;
        return this;
    }

    public Trajet build() {
        return new Trajet(depart, arrivee, dateDepart, dateArrivee, cout);
    }
}
