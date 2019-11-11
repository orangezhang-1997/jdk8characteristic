package Default;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class DefaultTest {
    /**
     * default 关键字，在JDK8 之前，接口中只能由抽象方法，但是在JDK8的时候加入了default关键字，可以去在接口中实现一些共通的方法。
     * @param args
     */
    public static void main(String[] args) {
        Animal dog =new Dog();
        Animal cat = new Cat();
        dog.eat();
        dog.run();
        dog.branch();
        cat.eat();
        cat.run();
        cat.branch();
    }
}
