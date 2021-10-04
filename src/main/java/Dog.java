

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
//        System.out.println("Создано собак: " + dogCount);
        setMaxRunDistance(500);
        setMaxSwimDistance(10);
    }

    @Override
    public void run(int distance) {
        System.out.println(distance < getMaxRunDistance() ? getName() + " пробежал " + distance + " м." : getName() + " пробежал " + getMaxRunDistance() + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(distance < getMaxSwimDistance() ? getName() + " пробежал " + distance + " м." : getName() + " пробежал " + getMaxSwimDistance() + " м.");

    }
}
