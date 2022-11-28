import java.text.DecimalFormat;

public abstract class transport {
    private final String brand;
    private final String model;
    private final String productionYear;
    private final String productionCountry;
    private String color;
    private double maxiMovementSpeed;
    protected double fuelPercentage;

    public abstract void refill(String TypeOfFuel);

    public transport(String brand, String model, String productionYear,
                     String productionCountry, String color,
                     double maxiMovementSpeed, double fuelPercentage) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (productionYear != null && !productionYear.isEmpty() && !productionYear.isBlank()) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = "2000";
        }
        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "Россия";
        }
        setColor(color);
        setMaxiMovementSpeed(maxiMovementSpeed);
        if (fuelPercentage > 0.00) {
            if (fuelPercentage <= 100.00) {
                this.fuelPercentage = fuelPercentage ;
            }
        }else{
            this.fuelPercentage = 60;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "красный";
        } else {
            this.color = color;
        }
    }

    public double getMaxiMovementSpeed() {
        return maxiMovementSpeed;
    }

    public void setMaxiMovementSpeed(double maxiMovementSpeed) {
        if (maxiMovementSpeed <= 0) {
            this.maxiMovementSpeed = 100;
        } else {
            this.maxiMovementSpeed = maxiMovementSpeed;
        }
    }
    public double getFuelPercentage() {
        return fuelPercentage;
    }
}
