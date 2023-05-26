package io.tezz.dsajava;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

    @Test 
    public void createEmptyArray() {
        Array array = new Array(0);
        assertFalse(array == null);
        assertEquals(array.getLength(), 0);
    }
}