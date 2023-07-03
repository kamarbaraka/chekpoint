package part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles;

    public Garage(){
        this.vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle... vehicles){
        for (Vehicle each : vehicles)
            this.vehicles.add(each);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Vehicle filterByPrice(double price){
        for (Vehicle each : this.vehicles)
            if (each.getPrice() == price)
                return each;
        return null;
    }

    public double getTotalValue(){
        var prices = new  ArrayList<Double>();

        for (Vehicle each : this.vehicles)
            prices.add(each.getPrice());

        var total = prices.stream().reduce(Double::sum).stream().toList();
        return total.get(0);
    }

    public static void main(String[] args) {
        var vehicle1 = new Vehicle("petrol", "hyundai", "hyundai", 4, 122455);
        var vehicle2 = new Vehicle("petrol", "hyundai", "hyundai", 4, 122455);
        var vehicle3 = new Vehicle("petrol", "hyundai", "hyundai", 4, 1224455);
        var vehicle4 = new Vehicle("petrol", "hyundai", "hyundai", 4, 1225665);

        var garage = new Garage();
        garage.addVehicle(vehicle1, vehicle2, vehicle3, vehicle4);

        System.out.println(garage.getVehicles());

        System.out.println(garage.filterByPrice(1225665));

        System.out.println(garage.getTotalValue());
    }
}
