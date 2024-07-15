package com.chervonnaya;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static com.chervonnaya.CollectionCountOfElements.countElems;
import static org.junit.jupiter.api.Assertions.*;

class CollectionCountOfElementsTest {
    @Test
    void testCollectionCountOfElements() {
        String[] list = {"a", "b", "c", "d", "e", "f", "a", "b", "c", "d", "e", "f", "a", "b", "c", "d"};
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 3);
        map.put("c", 3);
        map.put("d", 3);
        map.put("e", 2);
        map.put("f", 2);

        assertEquals(countElems(list), map);
    }
}