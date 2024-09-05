package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isfull()) {
            resize();
        }
        data[size++]=num;
    }

    private boolean isfull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data)
                + "size="+size;
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

    }
}