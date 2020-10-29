package HomeWork4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        DataContainer <Integer> container = new DataContainer<>(Integer.class, 5);
        container.add(4);
        container.add(6);
        container.add(1);
        container.add(8);
        container.add(2);
        container.add(1);
        System.out.println(container.toString());

        int x = container.get(5);
        System.out.println(x);

        container.delete(5);
        System.out.println(container.toString());

        container.delete(6);
        System.out.println(container.toString());

        }
    }

