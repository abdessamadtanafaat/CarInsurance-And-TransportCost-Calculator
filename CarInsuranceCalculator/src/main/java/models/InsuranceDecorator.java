package models;

public abstract class InsuranceDecorator implements Insurance {
    protected Insurance decoratedInsurance;

    public InsuranceDecorator(Insurance insurance) {
        this.decoratedInsurance = insurance;
    }

    @Override
    public String getDescription() {
        return decoratedInsurance.getDescription();
    }

    @Override
    public double calculateCost() {
        return decoratedInsurance.calculateCost();
    }
}