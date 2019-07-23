package T.test;

import T.method.addd;
import cn.itcast.day04.May2001demo.AbstractAnimaldemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class addTest {
    @Test
    public void testAdd(){
        addd a = new addd();
        int result = a.add(1, 2);
        Assertions.assertEquals(3,result);
    }
}
