package models;

public class TheftDecorator extends InsuranceDecorator {
    public TheftDecorator(Insurance insurance) {
        super(insurance);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Theft Coverage";
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 100.0;
    }
}