package io.tezz.dsajava;

public class Array {
    private int length;
    private int[] container;

    public Array(int length) {
        this.length = length;
        this.container = new int[this.length];
    }

    public int getLength() {
        return this.length;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= 0 && index < length) {
            return this.container[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}