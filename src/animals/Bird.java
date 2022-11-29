package animals;

public class Bird extends Animal {
    public void hunt() {
        System.out.println("Птица охотится.");
    }

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Птица ест.");
        System.out.println("ФАКT: Никогда не питают и не питаются молоком. У птиц очень различное питание между видами - среди них есть и хищники,и зерноядные, и всеядные.");
    }

    @Override
    public void moveAround() {
        System.out.println("Птица перемещается.");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
