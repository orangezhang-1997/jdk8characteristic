package Default;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void run() {
        System.out.println("running...");
    }
}
