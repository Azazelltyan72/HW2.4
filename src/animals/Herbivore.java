package animals;

import java.util.Objects;

public class Herbivore extends Mammal {
    private String typeOfFood;

    public void graze() {
        System.out.println("Травоядное пасётся.");
    }

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
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
            this.typeOfFood = "Растительный тип пищи.";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                "Herbivore{" +
                "typeOfFood='" + typeOfFood + '\'' + "movementSpeed='" + getMovementSpeed() + '\'' +
                getClass() + '}';
    }
}
