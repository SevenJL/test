import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {

        // 1. 创建数组
        int[] arr = {1,2,3,4,5,6,7,8};

        // 2.获取stream流
        Arrays.stream(arr).forEach(System.out::print);
    }
}
