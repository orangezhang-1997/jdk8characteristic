package lambda;

import java.util.function.BiFunction;

/**
 * BiFunction 和 Function类似，
 * 不过是Function的进阶，因为Function的入参只有一个，如果需要两个的话就没办法了，所以就有一个进阶是BiFunction，可以传入两个参数
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction =(p1,p2)->{
            System.out.println("biFunction测试");
            return p1*p2;
        };
        System.out.println(biFunction.apply(10,20));
        BiFunctionImpl biFunction1 = new BiFunctionImpl();
        biFunction1.apply(20,10);

    }
}
