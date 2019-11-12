package lambda;

import optition.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class LambdaTest {
    /**
     * JDK8改变的特性之一，增加了函数式编程，lambda表达式。
     * 可以将方法体当作参数来传入。
     * (params)->expression   params是一个形参而expression是一个方法体也可以是一个表达式
     * 如果是方法体的话 就可以加一个{}，如果只有一行的话 就可以将{}省略不写
     * 参数的数据类型是可以不用写的。
     * 当只有一个参数的时候，可以省略()与类型都不写
     *
     * @param args
     */
    public static void main(String[] args) {
        LambdaTest lambdaTest= new LambdaTest();
        lambdaTest.oldCreateThread();
        lambdaTest.newCreateThread();
    }

    public void oldCreateThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是旧的创建线程方式");
            }
        }).start();
    }

    public void newCreateThread(){
        new Thread(()-> System.out.println("这是用lambda表达式创建线程的方式")).start();
    }



}
