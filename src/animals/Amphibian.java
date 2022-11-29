package animals;

import java.util.Objects;

public class Amphibian extends Animal {
    private void hunt() {
        System.out.println("Земноводное охотится.");
    }

    public Amphibian(String name) {
        super(name);
    }

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Земноводное ест.");
        System.out.println("ФАКT: Никогда не питают и не питаются молоком. Все взрослые земноводные - хищники, реагиркющие только на живую подвижную добычу.");
    }

    @Override
    public void moveAround() {
        System.out.println("Земноводное перемещается.");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' + getClass() +
                '}';
    }
}
