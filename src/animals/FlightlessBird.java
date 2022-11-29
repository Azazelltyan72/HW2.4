package animals;

import java.util.Objects;

public class FlightlessBird extends Bird {
    private String typeOfMovement;

    public void walk() {
        System.out.println("Птица гуляет.");
    }

    public FlightlessBird(String name) {
        super(name);
    }

    public FlightlessBird(String name, int age, String livingEnvironment, String typeOfMovement) {
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
            this.typeOfMovement = "Пешеходдный тип перемещения.";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlightlessBird that = (FlightlessBird) o;
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
