package HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {
    private T[] data;
    public DataContainer(Class <T> c, int s) {
        T[] data = (T[]) Array.newInstance(c,s);
        this.data = data;
    }

    public int add(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            } else if (item == null) {
                return -1;
            }
        }
        data = Arrays.copyOf (data, data.length + 1);
        data [data.length - 1] = item;
        return data.length - 1;
    }

    public String toString(){
        return Arrays.toString(data);
    }

    public T get(int index) {
        if (data.length <= index) {
            return null;
        } else {
            return data[index];
        }
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (index > data.length - 1) {
            return false;
        }
        for (int i = 0; i < data.length - 1; i++) {
            if (i >= index) {
                data[i] = data[i + 1];
            }
        }
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

    public boolean delete(T item) {
        if (item != null) {
            return false;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (item == data[i]) {
                    data[i] = data[i + 1];
                }
            }
        }
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }
}




