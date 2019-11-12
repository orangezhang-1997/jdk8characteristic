package optition;

import java.util.Optional;

public class OptitionTest {
    /**
     *  Optional类主要用来解决NullPointException的问题，
     *  当选择of的时候 表示这是一个必穿参数，如果不传参的话就会爆出NullPointException异常，
     *  当选择ofNullable的时候，表示这是一个可选参数，可以传也可以不传。
     * @param args
     */
    public static void main(String[] args) {
        Student student=null;
        Student result;
        Optional<Student> optional=Optional.ofNullable(student);
        if (!optional.isPresent()){
            result = optional.get();
        }else {
            // 兜底数据，当传进来的参数为null的时候 就会返回一个兜底的数据
            result=optional.orElse(new Student());
        }
        System.out.println(result);


        optional.map(obj->obj.getAge()).orElse(1);
    }
}
