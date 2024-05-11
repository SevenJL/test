import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "dick-1","cock-2","tom-3","dimis-4","damaji-5");

//        // filter 过滤
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                // s表示流里面的每个数据
//                // 如果返回值为true 表示当前数据留下
//                // 如果返回值为false 表示当前数据不要
//
//                return s.startsWith("d");
//
//            }
//        }).forEach(System.out::println);
//        // dick dimis  damaji
//
//        System.out.println();
//        list.stream().filter(s -> !s.startsWith("d")).forEach(System.out::println);
//        // cock tom

//        Stream<String> stream1 = list.stream().filter(s -> s.startsWith("d"));
//        Stream<String> stream2 = stream1.filter(s -> s.length() == 3);
//
//        Stream<String> stream3 = stream1.filter(s -> s.length() == 3); // 报错 不能重复使用stream流
//        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed



        list.stream()
                .map(s ->Integer.parseInt( s.split("-")[1]))
                .forEach(System.out::println);
        // 1 2 3 4 5
    }
}
