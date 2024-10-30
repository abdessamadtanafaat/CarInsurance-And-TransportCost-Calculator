package models;

public class BaseInsurance implements Insurance {
    @Override
    public String getDescription() {
        return "Base Car Insurance with Liability Coverage";
    }

    @Override
    public double calculateCost() {
        return 200.0; // Base cost of liability insurance
    }
}