import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Demo7 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1","2","3","4");
        list.stream().map(Integer::parseInt).forEach(System.out::println);

        list.stream().map(Student::new).forEach(System.out::println);

    }

    @AfterEach
    public void test2(){
        System.out.println("init2........");
    }

    @BeforeEach
    public  void test(){
        System.out.println("init1......");
    }

    @Test
    public void test3(){
        System.out.println("test......");
    }
}
