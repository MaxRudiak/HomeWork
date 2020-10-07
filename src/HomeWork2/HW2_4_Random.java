package HomeWork2;

public class HW2_4_Random {
    public static void main(String[] args) {
        int size = ((int) (Math.random() * 20));
        System.out.println(size);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20));
            System.out.print(array[i] + " ");
        }
    }
}
