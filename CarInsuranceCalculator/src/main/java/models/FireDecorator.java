package models;

public class FireDecorator extends InsuranceDecorator {
    public FireDecorator(Insurance insurance) {
        super(insurance);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Fire Coverage";
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 120.0;
    }
}
