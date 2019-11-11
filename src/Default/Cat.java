package Default;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("cat eat...");
    }

    @Override
    public void run() {
        System.out.println("cat run...");
    }

    @Override
    public void branch() {
        System.out.println("cat branch...");
    }
}
