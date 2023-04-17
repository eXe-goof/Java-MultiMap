package net.exe.function;

import java.util.HashMap;
import java.util.Map;

public interface MultiMap3<K, X, Y, Z> {

    int slots = 3;
    Map<Object, Object> xMap3 = new HashMap<>();
    Map<Object, Object> yMap3 = new HashMap<>();
    Map<Object, Object> zMap3 = new HashMap<>();

    K get3(Object key, int slot);

    void put3(K k, X x, Y y, Z z);

    void clearAll3();
}
