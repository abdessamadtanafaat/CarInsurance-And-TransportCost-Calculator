package models;

public class FloodDecorator extends InsuranceDecorator {
    public FloodDecorator(Insurance insurance) {
        super(insurance);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Flood Coverage";
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 80.0;
    }
}