package part1;

public class Vehicle {

    private String fuelType, model, manufacturer;
    private int tyresNumber;
    private double price;

    public Vehicle(String fuelType, String model, String manufacturer, int tyresNumber,double price){
        this.tyresNumber = tyresNumber;
        this.fuelType = fuelType;
        this.manufacturer = manufacturer;
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("fuelType='").append(fuelType).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", tyresNumber=").append(tyresNumber);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        var vehicle = new Vehicle("petrol", "toyota", "toyota",4, 1235467);

        System.out.println(vehicle);
    }
}
