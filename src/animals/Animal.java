package animals;


import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironment;

    public abstract void eat();

    public void sleep() {
        System.out.println("Животное спит.");
    }

    public abstract void moveAround();

    public Animal(String name) {
        this(name, 0, null);
    }

    public Animal(String name, int age, String livingEnvironment) {
        setName(name);
        setAge(age);
        setLivingEnvironment(livingEnvironment);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Животное";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Планета Земля";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(livingEnvironment, animal.livingEnvironment);
    }


}
