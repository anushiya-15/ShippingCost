public class ShippingCost {

    public double calculateCost(double distance) {

        if (distance <= 100) {
            return distance * 5;
        }

        else if (distance <= 300) {
            return distance * 4;
        }

        else {
            return distance * 3;
        }
    }

    public static void main(String[] args) {

        ShippingCost s = new ShippingCost();

        System.out.println("Cost for 50 km = "
                + s.calculateCost(50));

        System.out.println("Cost for 200 km = "
                + s.calculateCost(200));

        System.out.println("Cost for 400 km = "
                + s.calculateCost(400));
    }
}