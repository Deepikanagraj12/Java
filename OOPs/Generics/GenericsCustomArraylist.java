package Generics;

import java.util.Arrays;

public class GenericsCustomArraylist<T> {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericsCustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isfull()) {
            resize();
        }
        data[size++]= (int) num;
    }

    private boolean isfull() {

        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = (int) data[i];
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
        GenericsCustomArraylist<Float> list1 = new GenericsCustomArraylist();
        list1.add(2.3f);
        list1.add(2f);
        list1.add(9.8f);
        System.out.println(list1);

    }
}