package io.github.guit4rfre4k.examples.java8.mapmerge;

import org.junit.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.Map;

public class MapMergeDemoTest {

    @Test
    public void test0(){
        Map<Integer, Integer> map = MapMergeDemo.createMergedMap(Arrays.asList());
        Assert.assertNull(map.get(1));
        Assert.assertNull(map.get(2));
        Assert.assertNull(map.get(3));
    }

    @Test
    public void test1(){
        Map<Integer, Integer> map = MapMergeDemo.createMergedMap(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3));
        Assert.assertTrue(map.get(1) == 3);
        Assert.assertTrue(map.get(2) == 3);
        Assert.assertTrue(map.get(3) == 3);
        map = MapMergeDemo.createMergedMap(Arrays.asList(1, 2, 2, 3, 3, 3));
        Assert.assertTrue(map.get(1) == 1);
        Assert.assertTrue(map.get(2) == 2);
        Assert.assertTrue(map.get(3) == 3);
    }

    @Test
    public void test2(){
        Map<Integer, Integer> map = MapMergeDemo.createMergedMap(Arrays.asList(1, 3, 1, 2, 2, 1, 3, 2, 3, 100));
        Assert.assertTrue(map.get(1) == 3);
        Assert.assertTrue(map.get(2) == 3);
        Assert.assertTrue(map.get(3) == 3);
        Assert.assertTrue(map.get(100) == 1);

    }


}