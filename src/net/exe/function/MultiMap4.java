package net.exe.function;

import java.util.HashMap;
import java.util.Map;

public interface MultiMap4<K, X, Y, Z, AZ> {

    int slots = 4;
    Map<Object, Object> xMap4 = new HashMap<>();
    Map<Object, Object> yMap4 = new HashMap<>();
    Map<Object, Object> zMap4 = new HashMap<>();
    Map<Object, Object> azMap4 = new HashMap<>();

    K get4(Object key, int slot);

    void put4(K k, X x, Y y, Z z, AZ az);

    void clearAll4();
}
