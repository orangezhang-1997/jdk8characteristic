package lambda;

import java.util.function.Function;

/**
 * 可以使用Function接口中的apply()方法，在声明的时候泛型第一个是入参第二个是返回值。
 * 也是函数式编程的一种
 *
 * 两种方式，第一种就是去实现Function接口，然后去重写apply方法，
 * 第二个就是直接去声明，然后用函数式编程去写
 */
public class FunctionTest {
    public static void main(String[] args) {
        // 函数式编程方式
        Function<Integer,String> function = (p)->{
            System.out.println("this is test");
            return String.valueOf(p*p);
        };


        String result = function.apply(100);
        System.out.println(result);
        // 实现Function接口方式
        FunctionImpl function1 = new FunctionImpl();
        System.out.println(function1.apply(100));
    }
}
