import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "dick-man-1","cock-man-2","tom-man-3","dimis-man-4","damaji-man-5");

        // 把数据收集到List集合中
        List<String> newList1 = list.stream().filter(s -> "man".equals(s.split("-")[1]))
                .collect(Collectors.toList());// Collectors为Stream中的一个工具 这个工具能够把这些数据变成集合

        // 把数据收集到set中
        Set<String> newList2 = list.stream().filter(s -> "man".equals(s.split("-")[1]))
                .collect(Collectors.toSet());

        // 把数据收集到Map集合中
        Map<String, Object> collect = list.stream().filter(s -> "man".equals(s.split("-")[1]))

                /**
                 *  toMap : 参数一表示 "键" 的生成规则
                 *          参数二表示 "值" 的生成规则
                 *  参数一:
                 *        Function 泛型一:表示  "流"  中每一个数据类型
                 *                 泛型二:表示  "Map集合"  中键的数据类型
                 *   方法apply形参:依次表示  "流"  里面的每个数据
                 *              方法体:生成 "键" 的代码
                 *              返回值:已经生成的 "键"
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Object>() {
                    @Override
                    public Object apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        System.out.println(collect);
        // {dimis=4, dick=1, tom=3, cock=2, damaji=5}
        // map中的键不能重复


        Map<String, String> map = list.stream().filter(s -> "man".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0]
                        , s -> s.split("-")[2]));

        System.out.println(map);
        // {dimis=4, dick=1, tom=3, cock=2, damaji=5}





    }
    public int sub(int n1, int n2){
        return  n1 - n2;
    }
}
