package models;


public class CollisionDecorator extends InsuranceDecorator {
    public CollisionDecorator(Insurance insurance) {
        super(insurance);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Collision Coverage";
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 150.0;
    }
}
