package animals;

import java.util.Objects;

public class Mammal extends Animal {
    private double movementSpeed;

    public void walk() {
        System.out.println("Млекопитающее гуляет.");
    }

    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, int age, String livingEnvironment, double movementSpeed) {
        super(name, age, livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающее ест.");
        System.out.println("ФАКT: Вскармливние детёнышей молоком.");
    }

    @Override
    public void moveAround() {
        System.out.println("Млекопитающее перемещается.");
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        if (movementSpeed >= 0) {
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = Math.abs(movementSpeed);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Double.compare(mammal.movementSpeed, movementSpeed) == 0;
    }

}
