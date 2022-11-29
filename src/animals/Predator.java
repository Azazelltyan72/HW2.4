package animals;

import java.util.Objects;

public class Predator extends Mammal {
    private String typeOfFood;

    public void hunt() {
        System.out.println("Хищник охотится.");
    }

    public Predator(String name) {
        super(name);
    }

    public Predator(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        setTypeOfFood(typeOfFood);
    }

    public final String getTypeOfFood() {
        return typeOfFood;
    }

    public final void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "Плотоядный тип питания.";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                "Predator{" +
                "typeOfFood='" + typeOfFood + '\'' + "movementSpeed='" + getMovementSpeed() + '\''
                + getClass() + '}';
    }
}