package com.chervonnaya;

import java.util.HashMap;

public class CollectionCountOfElements {
    public static <T> HashMap<T, Integer> countElems(T[] elems) {
        HashMap<T, Integer> count = new HashMap<>();
        for (int i = 0; i < elems.length; i++) {
            count.put(elems[i], count.getOrDefault(elems[i], 0) + 1);
        }
        return count;
    }
}
