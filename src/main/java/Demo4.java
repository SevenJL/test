import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        String[] arr2 = {"a","b","c"};

        /**
         * Stream接口中静态方法of的细节
         * 方法的形参必须是一个可变参数,可以传递一堆零散的数据,也可以传递数组
         * 但是数组必须是引用数据类型的,如果传递基本数据类型,是会把整个数组当做一个元素, 放到Stream流中
         */
        Stream.of(arr1).forEach(System.out::println); // [I@6a5fc7f7
        Stream.of(arr2).forEach(System.out::println); // a b c


    }
}
