package HomeWork2;

public class HW2_4_Sort {
    public static void sortBubble (int[] array){
        for (int i = 0; i <array.length - 1; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array[j - 1] > array[j]) {
                    int tmp = array [j-1];
                    array [j-1] = array [j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void sortShake (int[] array) {
        int left = 0;
        int right = array.length -1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = array[i + 1];
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = array[i - 1];
                }
            }
            left++;
        } while (left <= right) ;
        }
    }


