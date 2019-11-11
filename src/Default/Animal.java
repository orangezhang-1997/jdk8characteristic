package Default;

public interface Animal {
    void eat();

    void run();

    default void branch(){
        System.out.println("branch");
    }

    static void happy(){
        System.out.println("Happy");
    }

}
