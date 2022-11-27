public class Bus extends transport{

    public Bus(String brand, String model, String productionYear, String productionCountry, String color, double maxiMovementSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxiMovementSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", productionYea r='" + getProductionYear() + '\'' +
                ", productionCountry ='" + getProductionCountry() + '\'' +
                ", color ='" + getColor() + '\'' +
                " maxiMovementSpeed = " + getMaxiMovementSpeed() + " км/ч.}";
    }
}
