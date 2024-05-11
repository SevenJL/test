import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c","d");

        Stream<String> stream1 = list.stream();// 获取一条流水线 并把集合中的数据 放到流水线上
        // 使用终结方法 打印流水线上所有的数据
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                // s.表示 流水线上的 每一个数据
                System.out.print(" " + s);
            }
        });

        list.stream().forEach(s -> System.out.println(s)); // 链式编程
    }
}
