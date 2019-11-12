package lambda;

import java.util.function.Function;

public class FunctionImpl implements Function {
    @Override
    public Object apply(Object o) {
        return "实现接口测试";
    }
}
