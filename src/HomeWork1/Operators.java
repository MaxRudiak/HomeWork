package HomeWork1;

public class Operators {
    public static void main(String[] args) {
        int x = 8;
        int op1 = 5 + 2 / 8;  // = 5  вначале при делении получаем 0,25
                             // в целочисленном int отбрасываем дробную часть,
                            // получаем 0, складываем 5 и 0

        int op2 = (5 + 2) / 8;  // = 0 сначала выполняем операцию в скобках,
                               // получае 7, делим на 8, отбрасываем дробную часть
                              // т.к. op2 объявлена в целочисленном типе int, получаем 0

        int z = 2;

        int op3 = (5 + z++) / 8; /*
                                 =0   z++ - это операция инкремента в постфиксной форме
                                 поэтому в выражении применяется значение 2,
                                 и только после этого значение z изменяется
                                 op3 = (5 + 2) / 8; выполняем сложение в скобках,
                                 полученное 7 делим на восемь,
                                 получаем 0,875, в int оставляем только целую часть
                                 z = z + 1;
                               */

        z = 2;
        int op4 = (5 + z++) / --x; /*
                                    =1  z++ - это операция инкремента в постфиксной форме
                                    поэтому в выражении применяется значение 2,
                                    и только после этого значение z изменяется
                                    --x - это операция декремента в префиксной форме
                                   поэтому значение x уменьшается на 1 до применения в выражении
                                   op4 = (5 + 2) / 7; выполняем сложение в скобках,
                                   полученное 7 делим на 7, получаем 1
                                 */

        z = 2;
        x = 8;
        int op5 = (5 * 2 >> z++) / --x; /*
                                         =0  z++ - это операция инкремента в постфиксной форме
                                         поэтому в выражении применяется значение 2,
                                         и только после этого значение z изменяется
                                         --x - это операция декремента в префиксной форме
                                   поэтому значение x уменьшается на 1 до применения в выражении
                                   далее по приоретету следует умножение в скобках 5 * 2 = 10
                                   затем следует операция сдвиг вправо 10 / 2 / 2 = 2,5,
                                   остаток отбрасываем, полученное 2 делим на 7,
                                   получаем целочисленный 0
                                 */

        z = 2;
        x = 8;
        int op6 = (5 + 7 > 20 ? 68 : 22 * 2 >> z++) / --x;
            System.out.println(op6);
                                    /*
                                      получается 1
                                      22 * 2 >> 2 = 11
                                      12 > 20 ? 68 : 11 / 7
                                      11 / 7 в int равно 1
                                    */

        z = 2;
        x = 8;
        //int op7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> z++) / --x;
            /*
              выражение не выполняется, т.к. на месте, где
              68>=68 должно быть не операция сравнеия, дающая в результате
              логическое значение, а числовое значение, либо что-то вроде
              ... 68 >= 68 ? 9 : 8 : 22 * 2 ...
            */

        boolean k;
        k = 6 - 2 > 3 && 12 * 12 <= 119;
            /*
              = false
              по приритету первым выполняем умножение 12*12, получаем 144
              далее седует 6-2, получаем 4
              далее слева направо проводим операции сравнения 4 > 3 и 144 <= 119
              получаем true && false
              применение укороченной формы логической операции И дает false
            */

        boolean v = true && false;
            /*
              = false
               укороченная форма логического операции И в данном случае дает false
               если бы значение левого операнда было false, то правый операнд не
               прверялся бы, в данном случае он проверяется,
               в результате получаем false
             */
            System.out.println(v);
    }
}