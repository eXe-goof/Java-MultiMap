package net.exe.test;

import net.exe.function.GoofMap;
import net.exe.function.MultiMap;

public class Test {
    public static void main(String[] args) {
        MultiMap<Integer,String,String> map = new GoofMap();
        map.put(5,"a","b");
        map.put(5235,"a","b");
        map.put(65,"a","b");
        map.put(4765,"a","b");
        map.put(23,"a","wlakjhbfkjawf");
        map.put(675,"a","b");
        map.put(345,"akwjbnfjkawnf","b");
        System.out.println(map.get(5, 1));
        System.out.println(map.get(23, 2));
        System.out.println(map.get(345,5));
    }
}
