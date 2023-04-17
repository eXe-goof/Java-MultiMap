package net.exe.function;

import java.util.Map;

public class GoofMap implements MultiMap{

    @Override
    public Object get(Object key, int slot) {
        switch (slot) {
            case 2:
                return yMap.get(key);
            default:
                return xMap.get(key);
        }
    }

    @Override
    public void put(Object o, Object o2, Object o3) {
        xMap.put(o, o2);
        yMap.put(o, o3);
    }

    @Override
    public void clearAll() {
        yMap.clear();
        xMap.clear();
    }




}
