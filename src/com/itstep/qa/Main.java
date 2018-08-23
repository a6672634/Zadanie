package com.itstep.qa;

public class Main {
    public static void main(String[] args) {

         /* Задание 1
       int a = 150;  реализовать алгоритм вычисляющий среднеарифметическое 4х чмсел и выводящий это на экран
        int b = 317;
        int c = 535;
        int d = 248;
        float x;
        x = (a+b+c+d)/4;
        System.out.println(x); */
         /*Задание 2
            float rad = 125.12f;  Алгоритм вычиления площади круга
        float pi = 3.14f;
        float s ;

        s= (pi *(rad*rad));

        System.out.println(s);
          */

         /*Задание 3
        дано 1865 часов. Вывести на экран колличество целых дней и часов в виде : "Было дано 1865 часов.Это равно х дней и У часов.

        float day = 0;
        float hours = 1865;
        float result = 0;
        result=hours%=24;
       day=(1865-result)/24;

        System.out.println("Дней " + day + " Часов " + result);
          */
         /*Задание 4.  Дана геометрическая прогрессия 99, 33, 11, ... найти сумму данной прогрессии*/
       /* Вариант с циклами.
        int sum = 0;
        for(int i = 99; i > 3; i = i / 3){
            sum += i;
                    }
        System.out.println(sum);*/

        int sum = 99 + 33 + 11 ;
        System.out.println( sum );
    }
}
