package HomeWork1;

public class Binary{
    public static void main(String[] args) {
        int a = 42; // 00101010
        int b = 15; // 00001111

        // 11010101 инвертируем все двоичные разряды операнда,
        // использую byte, чтоб было меньше двоичных разрядов
        byte c = ~42; //11010101
        byte d = ~15; // 11110000

        int e = 42 & 15; /*
                            00101010
                          & 00001111  если в обоих операндах двоичные разряды равны 1,
                            получаем 1 в результате
                            00001010 - результат
                          */
            System.out.println(e);
            System.out.println(Integer.toBinaryString(e)); // проверил себя

        int f = 42 | 15; /*
                            00101010
                          | 00001111  если в любом операнде двоичный разряд равен 1,
                            получаем 1 в результате
                            00101111 - результат
                          */
            System.out.println(Integer.toBinaryString(f));

        int g = 42 ^ 15; /*
                            00101010
                          ^ 00001111  получаем 1 в результате,
                            если 1 только в одном двоичном разряде операндов
                            00100101 - результат
                          */

        a &= 15; // то же самое, что a = 42 & 15
            System.out.println(a);
            System.out.println(Integer.toBinaryString(a));
        a |= 15; // то же, что и a = 42 | 15
        a ^= 15; // то же, что и 42 ^ 15

        int i = 42 << 15; // 101010 сдвигаем все двоичные разряды на 15 позиций влево
                         // получаем 00010101_00000000_00000000 впереди еще будут нули
            System.out.println(Integer.toBinaryString(i));
            // a <<= 15 то же, что и a = a << 15, при присвоенных в начале значениях a = 42 << 15
           //  далее сдвигаем двоичные разряды 42 на 15 разрядов влево, как показано выше

        int j = 42 >> 15; // 101010 все двоичные разряды сдвигаются вправо на 15 позиций
                         // в результате получаем нули во всех двоичных разрядах
            System.out.println(Integer.toBinaryString(j));
            // a >>= 15  аналогичная операция

        int k = 42 >>> 15; /*
                            выполняется сдвиг вправо на 15 битов, при этом
                            15 старших двоичных разрядо заполняются нулями,
                            в результате все двоичные разряды содержат ноль
                          */
            // >>>= аналогично

            // 1.5 побитовые операции с числом 42.5 не делаются
            // т.к. они выполняются только с целочисленными типами
            // byte, short, int, long, char
    }
}
















