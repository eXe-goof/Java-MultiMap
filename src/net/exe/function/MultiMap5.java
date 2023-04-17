package net.exe.function;

import java.util.HashMap;
import java.util.Map;

public interface MultiMap5<K, X, Y, Z, AZ, BZ> {

    int slots = 5;
    Map<Object, Object> xMap5 = new HashMap<>();
    Map<Object, Object> yMap5 = new HashMap<>();
    Map<Object, Object> zMap5 = new HashMap<>();
    Map<Object, Object> azMap5 = new HashMap<>();
    Map<Object, Object> bzMap5 = new HashMap<>();

    K get5(Object key, int slot);

    void put5(K k, X x, Y y, Z z, AZ az, BZ bz);

    void clearAll5();
}
