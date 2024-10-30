package models;

import java.util.ArrayList;
import java.util.List;

public class Mission implements AbsMission {
    private String nom;
    private List<AbsMission> composants = new ArrayList<>();

    public Mission(String nom) {
        this.nom = nom;
    }

    public void ajouterComponent(AbsMission component) {
        composants.add(component);
    }

    @Override
    public double calculerCout() {
        return composants.stream().mapToDouble(AbsMission::calculerCout).sum();
    }

    @Override
    public void view() {
        System.out.println("Mission: " + nom);
        for (AbsMission component : composants) {
            component.view();
        }
        System.out.println("Coût total de la mission " + nom + " : " + calculerCout());
    }
}
