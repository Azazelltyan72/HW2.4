package animals;

import java.util.Objects;

public class FlyingBird extends Bird {
    private String typeOfMovement;

    public void fly() {
        System.out.println("Птица летает.");
    }

    public FlyingBird(String name) {
        super(name);
    }

    public FlyingBird(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }

    public final String getTypeOfMovement() {
        return typeOfMovement;
    }

    public final void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = "Перелётныйтип перемещения.";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyingBird that = (FlyingBird) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                "FlightlessBird{" +
                "typeOfMovement='" + typeOfMovement + '\'' + getClass() +
                '}';
    }
}
