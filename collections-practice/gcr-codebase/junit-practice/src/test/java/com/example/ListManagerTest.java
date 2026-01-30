package com.example;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);
        list.add(30);

        listManager.removeElement(list, 20);

        assertEquals(2, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);

        int size = listManager.getSize(list);

        assertEquals(2, size);
    }
}
