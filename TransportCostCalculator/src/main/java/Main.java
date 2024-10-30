
import builder.TrajetBuilder;
import models.Mission;
import models.Trajet;
import services.MissionCostCalculator;
import services.MissionView;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Création de trajets
        Trajet agadirCasablanca = new TrajetBuilder()
                .setDepart("Agadir")
                .setArrivee("Casablanca")
                .setDateDepart(LocalDate.of(2024, 10, 1))
                .setDateArrivee(LocalDate.of(2024, 10, 2))
                .setCout(500)
                .build();

        Trajet rabatCasablanca = new TrajetBuilder()
                .setDepart("Rabat")
                .setArrivee("Casablanca")
                .setDateDepart(LocalDate.of(2024, 10, 3))
                .setDateArrivee(LocalDate.of(2024, 10, 4))
                .setCout(300)
                .build();

        // Création de missions
        Mission missionPrincipale = new Mission("Mission principale");
        Mission sousMission1 = new Mission("Sous-mission 1");

        // Ajout de trajets et sous-missions
        missionPrincipale.ajouterComponent(agadirCasablanca);
        sousMission1.ajouterComponent(rabatCasablanca);
        missionPrincipale.ajouterComponent(sousMission1);

        // Affichage et calcul du coût
        MissionView.afficherMission(missionPrincipale);
        double coutTotal = MissionCostCalculator.calculerCout(missionPrincipale);
        System.out.println("Coût total de la mission principale : " + coutTotal);
    }
}
