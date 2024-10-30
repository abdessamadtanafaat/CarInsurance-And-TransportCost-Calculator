import models.*;

public class Main {
    public static void main(String[] args) {
        Insurance basicInsurance = new BaseInsurance();

        // Add Theft, Collision, and Fire Coverage
        Insurance fullCoverage = new TheftDecorator(new CollisionDecorator(new FireDecorator(basicInsurance)));

        System.out.println("Insurance Description: " + fullCoverage.getDescription());
        System.out.println("Total Cost: " + fullCoverage.calculateCost());

        // Add Flood Coverage to basic insurance
        Insurance floodCoverage = new FloodDecorator(basicInsurance);
        System.out.println("Insurance Description with Flood: " + floodCoverage.getDescription());
        System.out.println("Total Cost with Flood: " + floodCoverage.calculateCost());
    }
}