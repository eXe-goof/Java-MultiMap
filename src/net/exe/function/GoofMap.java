package net.exe.function;

public class GoofMap implements MultiMap2, MultiMap3, MultiMap4, MultiMap5 {

    @Override
    public Object get2(Object key, int slot) {
        switch (slot) {
            case 2:
                return yMap2.get(key);
            default:
                return xMap2.get(key);
        }
    }

    @Override
    public Object get3(Object key, int slot) {
        switch (slot) {
            case 2:
                return yMap3.get(key);
            case 3:
                return zMap3.get(key);
            default:
                return xMap3.get(key);
        }
    }

    @Override
    public Object get4(Object key, int slot) {
        switch (slot) {
            case 2:
                return yMap4.get(key);
            case 3:
                return zMap4.get(key);
            case 4:
                return azMap4.get(key);
            default:
                return xMap4.get(key);
        }
    }

    @Override
    public Object get5(Object key, int slot) {
        switch (slot) {
            case 2:
                return yMap5.get(key);
            case 3:
                return zMap5.get(key);
            case 4:
                return azMap5.get(key);
            case 5:
                return bzMap5.get(key);
            default:
                return xMap5.get(key);
        }
    }

    @Override
    public void put2(Object o, Object o2, Object o3) {
        xMap2.put(o,o2);
        yMap2.put(o,o3);
    }

    @Override
    public void put3(Object o, Object o2, Object o3, Object o4) {
        xMap3.put(o,o2);
        yMap3.put(o,o3);
        zMap3.put(o,o4);
    }

    @Override
    public void put4(Object o, Object o2, Object o3, Object o4, Object o5) {
        xMap4.put(o,o2);
        yMap4.put(o,o3);
        zMap4.put(o,o4);
        azMap4.put(o,o5);
    }

    @Override
    public void put5(Object o, Object o2, Object o3, Object o4, Object o5, Object o6) {
        xMap5.put(o,o2);
        yMap5.put(o,o3);
        zMap5.put(o,o4);
        azMap5.put(o,o5);
        bzMap5.put(o,o6);
    }

    @Override
    public void clearAll2() {
        yMap2.clear();
        xMap2.clear();
    }

    @Override
    public void clearAll3() {
        xMap3.clear();
        yMap3.clear();
        zMap3.clear();
    }

    @Override
    public void clearAll4() {
        xMap4.clear();
        yMap4.clear();
        zMap4.clear();
        azMap4.clear();
    }

    @Override
    public void clearAll5() {
        xMap5.clear();
        yMap5.clear();
        zMap5.clear();
        azMap5.clear();
        bzMap5.clear();
    }
}