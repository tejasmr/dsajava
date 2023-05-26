package io.tezz.dsajava;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

    @Test 
    public void createdEmptyArrayIsNotNull() {
        Array array = new Array(0);
        assertFalse(array == null);
    }

    @Test
    public void emptyArrayIsOfLengthZero() {
        Array array = new Array(0);
        assertEquals(array.getLength(), 0);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void emptyArrayThrowsExGetIndexZero() {
        Array array = new Array(0);
        array.get(0);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void emptyArrayThrowsExGetIndexNegative() {
        Array array = new Array(0);
        array.get(-1);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void emptyArrayThrowsExGetIndexPositive() {
        Array array = new Array(0);
        array.get(1);
    }


}