package HomeWork2;

import java.util.Arrays;

public class HW2_4_SortTest2 {
    public static void main(String[] args) {
        int [] [] data = {
                {1, 2, 3, 4, 5, 6},
                {1, 1, 1, 1},
                {9, 1, 5, 99, 9, 9},
                {},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + "->");
            HW2_4_Sort.sortShake(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

