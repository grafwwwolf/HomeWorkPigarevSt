

public abstract class Animal {

    private static int animalCount = 0;

    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;

    public Animal(String name) {
        this.name = name;
        animalCount++;
//        System.out.println("Создано животных: " + animalCount);
    }

    public String getName() {
        return name;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}
