

public class Cat extends Animal {

    private static int  catCount= 0;

    public Cat(String name) {
        super(name);
        catCount++;
//        System.out.println("Создано котов: " + catCount);
        setMaxRunDistance(200);
    }

    @Override
    public void run(int distance) {
        System.out.println(distance < getMaxRunDistance() ? getName() + " пробежал " + distance + " м." : getName() + " пробежал " + getMaxRunDistance() + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Я - кот и я не умею плавать!!!");
    }
}
