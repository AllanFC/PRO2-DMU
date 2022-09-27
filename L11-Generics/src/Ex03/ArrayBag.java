package Ex03;

import java.util.Arrays;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
		this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if(!isFull()){
            items[size] = newEntry;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        if(!isEmpty()){
            E item = items[size-1];
            items[size-1] = null;
            size--;
            return item;
        }
        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        for (int i = 0; i < items.length; i++) {
            E k = items[i];
            if(k != null && k.equals(anEntry)){
                items[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(items, null);
        size = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int count = 0;
        for (E entry : items) {
            if(entry != null && entry.equals(anEntry)){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(E anEntry) {
        int i = 0;
        boolean found = false;
        while(i < items.length && !found){
            E k = items[i];
            if(k != null && k.equals(anEntry)){
                found = true;
            }
            i++;
        }
        return found;
    }

    @Override
    public E[] toArray() {
        E[] newarr = items;
        return newarr;
    }
}
