public class Train extends transport {

    private double priceOfTrip;
    private String travelTime;
    private String nameOfDepartureStation;
    private String finalStop;
    private int numberOfWagons;

    public Train(String brand, String model, String productionYear, String productionCountry, String color,
                 double maxiMovementSpeed, double priceOfTrip, String travelTime, String nameOfDepartureStation,
                 String finalStop, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxiMovementSpeed);
        setPriceOfTrip(priceOfTrip);
        setTravelTime(travelTime);
        setNameOfDepartureStation(nameOfDepartureStation);
        setFinalStop(finalStop);
        setNumberOfWagons(numberOfWagons);
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        if (priceOfTrip > 0) {
            this.priceOfTrip = priceOfTrip;
        } else {
            this.priceOfTrip = 20.99;
        }
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime != null && !travelTime.isEmpty() && !travelTime.isBlank()) {
            this.travelTime = travelTime;
        } else {
            this.travelTime = "1,5";
        }
    }

    public String getNameOfDepartureStation() {
        return nameOfDepartureStation;
    }

    public void setNameOfDepartureStation(String nameOfDepartureStation) {
        if (nameOfDepartureStation != null && !nameOfDepartureStation.isEmpty() && !nameOfDepartureStation.isBlank()) {
            this.nameOfDepartureStation = nameOfDepartureStation;
        } else {
            this.nameOfDepartureStation = "Станция Кинг-Кросс";
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isEmpty() && !finalStop.isBlank()) {
            this.finalStop = nameOfDepartureStation;
        } else {
            this.finalStop = "Станция Хогсмид";
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) {
            this.numberOfWagons = numberOfWagons;
        } else {
            this.numberOfWagons = 3;
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", productionYea r='" + getProductionYear() + '\'' +
                ", productionCountry ='" + getProductionCountry() + '\'' +
                ", color ='" + getColor() + '\'' +
                " maxiMovementSpeed = " + getMaxiMovementSpeed() + " км/ч\'" +
                " priceOfTrip = " + priceOfTrip +
                ", travelTime ='" + travelTime  + " ч\'" +
                ", nameOfDepartureStation ='" + nameOfDepartureStation + '\'' +
                ", finalStop ='" + finalStop + '\'' +
                ", numberOfWagons = " + numberOfWagons +
                '}';
    }
}
