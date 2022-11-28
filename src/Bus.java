public class Bus extends transport {


    @Override
    public void refill(String TypeOfFuel) {
        System.out.println(getBrand() +" "+ getModel() + " заправляется " + TypeOfFuel);
    }

    public Bus(String brand, String model, String productionYear, String productionCountry, String color, double maxiMovementSpeed, double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxiMovementSpeed, fuelPercentage);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", productionYea r='" + getProductionYear() + '\'' +
                ", productionCountry ='" + getProductionCountry() + '\'' +
                ", color ='" + getColor() + '\'' +
                " maxiMovementSpeed = " + getMaxiMovementSpeed() + " км/ч." +
                " fuelPercentage = " + String.format("%.2f",fuelPercentage) + " %.}";
    }
}
