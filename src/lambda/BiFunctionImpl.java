package lambda;

import java.util.function.BiFunction;

public class BiFunctionImpl implements BiFunction {
    @Override
    public Object apply(Object o, Object o2) {
        System.out.println("实现类测试");
        return null;
    }
}
