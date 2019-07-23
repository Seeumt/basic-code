package B.Jun04demo01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.SplittableRandom;

import static B.Jun04demo01.Color.*;

public class EnumDemo {
    public Color eeee;

    public void test() {

        eeee =Color.BLUE;
        eeee = Color.GREEN;
        eeee = Color.RED;
    System.out.println(eeee);

    Color[] values = Color.values();
    System.out.println(Arrays.toString(values));//获取枚举的所有的值
}

@Test
    public void test1(){
    EnumSet<Color> set = EnumSet.allOf(Color.class);
    for (Color c : set) {
        System.out.println(c);
    }

    EnumMap<Color,String> map = new EnumMap<>(Color.class);
    map.put(BLUE,"blue");
}

@Test
    public void test2(){
    System.out.println(BLUE.getColor());//color.BLUE
}
@Test
    public void test3(){

    System.out.println(RED.getColor());//color.BLUE
}
}
