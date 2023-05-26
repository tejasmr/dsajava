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
}