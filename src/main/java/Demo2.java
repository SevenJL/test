import java.util.HashMap;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {


        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        Set<String> keySet = hm.keySet(); // 先获取所有的key和set
        // 1.获取stream流
        keySet.stream().forEach(s -> System.out.println(s));

        // 2.
        hm.entrySet().stream().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));
    }
}
