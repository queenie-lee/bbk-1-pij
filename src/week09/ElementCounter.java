package week09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ElementCounter<E>{

    /**
     * Write a generic static method count that takes a generic Collection<? extends E> as input and
     * returns a Map<E, Integer> as output which maps each entry of the input collection to the number of
     * times it occurs in the input collection.
     */
    public Map<? extends E, Integer> count(Collection<? extends E> collection) {
        Map<E,Integer> map = new HashMap<>();
        for (E i : collection) {
            if (map.get(i) == null) {
                map.put(i,1);
            } else {
                int add = map.get(i);
                add++;
                map.remove(i);
                map.put(i, add);
            }
        }
        return map;
    }
}
