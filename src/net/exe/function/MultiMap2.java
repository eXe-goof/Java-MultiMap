package net.exe.function;

import java.util.HashMap;
import java.util.Map;

public interface MultiMap2<K, X, Y> {

    int slots = 2;
    Map<Object, Object> xMap2 = new HashMap<>();
    Map<Object, Object> yMap2 = new HashMap<>();

    K get2(Object key, int slot);

    void put2(K k, X x, Y y);

    void clearAll2();
}
