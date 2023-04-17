package net.exe.function;

import java.util.HashMap;
import java.util.Map;

public interface MultiMap<K, X, Y> {

    Map<Object, Object> xMap = new HashMap<>();
    Map<Object, Object> yMap = new HashMap<>();

    K get(Object key, int slot);

    void put(K k, X x, Y y);



    void clearAll();
}
