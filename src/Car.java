public class Car extends transport {
    @Override
    public void refill(String TypeOfFuel) {
        System.out.println(getBrand() +" "+ getModel() + " заправляется " + TypeOfFuel);
    }

    public static class Insurance {
        private final int validityPeriodInsurance;
        private final double costInsurance;
        private final String numberInsurance;

        public Insurance(int validityPeriodInsurance, double costInsurance, String numberInsurance) {
            if (validityPeriodInsurance > 0) {
                this.validityPeriodInsurance = validityPeriodInsurance;
            } else {
                this.validityPeriodInsurance = 365;
            }
            this.costInsurance = costInsurance;
            if (numberInsurance != null) {
                this.numberInsurance = numberInsurance;
            } else {
                this.numberInsurance = "888888888";
            }
        }

        public Insurance() {
            this(0, 5000, null);
        }

        public int getValidityPeriodInsurance() {
            return validityPeriodInsurance;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public void checValidityPeriod() {
            if (validityPeriodInsurance > validityPeriodInsurance) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (numberInsurance.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(true, true);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

    }

    private final int numberOfSeats;
    private final String bodyType;
    private String engineVolume;
    private String transmission;

    private String registrationNumber;

    private String typeOfRubber;
    private Key key;
    private Insurance insurance;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTypeOfRubber(boolean summerTires) {
        return typeOfRubber;
    }

    public void setTypeOfRubber(boolean summerTires) {
        if (summerTires == true) {
            this.typeOfRubber = "Летняя резина";
        } else {
            this.typeOfRubber = "Зимняя резина";
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Car(String brand,
               String model,
               String productionYear,
               String productionCountry,
               int numberOfSeats,
               String bodyType,
               String color,
               String engineVolume,
               String transmission,
               String registrationNumber,
               boolean summerTires,
               Key key,
               Insurance insurance,
               double maxiMovementSpeed,
               double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxiMovementSpeed, fuelPercentage);
        if (numberOfSeats >= 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = Math.abs(numberOfSeats);
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Пикап";
        }
        if (engineVolume != null && !engineVolume.isEmpty() && !engineVolume.isBlank()) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = "1,5 л";
        }
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Полуавтомат";
        }

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "х000хх000";
        }
        if (summerTires == true) {
            this.typeOfRubber = "Летняя резина";
        } else {
            this.typeOfRubber = "Зимняя резина";
        }
        if (key != null) {
            this.key = key;
        } else {
            this.key = new Key();
        }
        if (insurance != null) {
            this.insurance = insurance;
        } else {
            this.insurance = new Insurance();
        }

    }

    public void changeTiresForSeasonalOnes() {
        if (typeOfRubber == "Зимняя резина") {
            typeOfRubber = "Летняя резина";
        } else {
            typeOfRubber = "Зимняя резина";
        }
    }

    public boolean checkRegistrationNumber() {
        //х000хх000
        if (this.registrationNumber.length() != 9) {
            System.out.println("Регистрационный номер неверный.");

            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", productionYea r='" + getProductionYear() + '\'' +
                ", productionCountry ='" + getProductionCountry() + '\'' +
                ", numberOfSeats = " + numberOfSeats +
                ", bodyType ='" + bodyType + '\'' +
                ", color ='" + getColor() + '\'' +
                ", engineVolume ='" + engineVolume + '\'' +
                ", transmission ='" + transmission + '\'' +
                ", registrationNumber ='" + registrationNumber + '\'' +
                ", typeOfRubber ='" + typeOfRubber + '\'' +
                ", key = удаленный запуск двигателя " + key.keylessAccess +
                ", = бесключевой доступ " + key.remoteEngineStart +
                ", insurance = срок действия " + insurance.validityPeriodInsurance +
                " дней, = стоимость " + insurance.costInsurance +
                " руб., = номер " + insurance.numberInsurance +
                " maxiMovementSpeed = " + getMaxiMovementSpeed() +
                " км/ч," + " fuelPercentage = " + String.format("%.2f", fuelPercentage) + " %.}";
    }
}
