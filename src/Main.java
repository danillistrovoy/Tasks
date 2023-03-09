import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }


    private static class Task1 {             //Ввести 2 переменных(int) и поменять их местами.
        public static void main(String[] args) {
            Scanner numbers = new Scanner(System.in);
            System.out.println("Введите целое число №1");
            int number1 = numbers.nextInt();
            System.out.println("Введите целое число №2");
            int number2 = numbers.nextInt();
            int number3;
            number3 = number1;
            number1 = number2;
            number2 = number3;
            System.out.println("Теперь число 1 = " + number1 + ", а число 2 = " + number2 + ".");


        }

        private static class Task2 {    //Ввести 2 переменных(int) и поменять их местами без использования третьей переменной
            public static void main(String[] args) {
                Scanner numbers = new Scanner(System.in);
                System.out.println("Введите целое число №1");
                int number1 = numbers.nextInt();
                System.out.println("Введите целое число №2");
                int number2 = numbers.nextInt();
                number1 = number1 + number2;
                number2 = number1 - number2;
                number1 = number1 - number2;
                System.out.println("Теперь число 1 = " + number1 + ", а число 2 = " + number2 + ".");


            }

        }
    }

    private static class Task3 {            //Ввести 2 переменных(int) и вывести наибольшее (без Math).
        public static void main(String[] args) {
            Scanner numbers = new Scanner(System.in);
            System.out.println("Введите целое число №1");
            int number1 = numbers.nextInt();
            System.out.println("Введите целое число №2");
            int number2 = numbers.nextInt();
            int result = number1 < number2 ? number2 : number1;
            System.out.println("Наибольшее из введённых чисел - " + result);


        }

    }

    private static class Task4 {            //Ввести 2 переменных(int) и вывести наименьшее (без Math).
        public static void main(String[] args) {
            Scanner numbers = new Scanner(System.in);
            System.out.println("Введите целое число №1");
            int number1 = numbers.nextInt();
            System.out.println("Введите целое число №2");
            int number2 = numbers.nextInt();
            int result = number1 < number2 ? number1 : number2;
            System.out.println(result);
            System.out.println("Наименьшее из введённых чисел - " + result);
        }
    }

    private static class Task5 {            //Ввести число и вывести признак чётности/нечётности.
        public static void main(String[] args) {
            Scanner numbers = new Scanner(System.in);
            int a = numbers.nextInt();
            int b = a % 2;
            switch (b) {
                case 0:
                    System.out.println("Введенное число четное");
                case 1:
                    System.out.println("Введенное число нечентное");

            }


        }

    }

    private static class Task6 {            // Дан массив чисел, найти наибольшее и вывести
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (max < numbers[i]) {
                    max = numbers[i];
                }
            }
            System.out.println("Наибольшее число массива - " + max);

        }
    }

    private static class Task7 {             //Дан массив чисел, найти наименьшее и вывести.
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }
            System.out.println("Наименьшеее число массива - " + min);


        }
    }

    private static class Task8 {
        public static void main(String[] args) {
            int[] numbers = {1, 4, 7, 10, 18, 11};
            int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
            double average;
            double sum1 = 0.0;
            for (int i = 0; i < numbers.length; i++) {
                sum1 += numbers[i];
            }
            average = sum1 / numbers.length;
            int mid = numbers.length / 2;
            int median = 0;
            if (numbers.length % 2 == 1) {
                median = numbers[mid];
            } else {
                median = (numbers[mid - 1] + numbers[mid]) / 2;
            }
            System.out.println(median);


        }

    }

    private static class Task9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите грань массива");
            int n = scanner.nextInt();
            int[][] matrice = new int[n][n];
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                    System.out.print((int) ((Math.pow(2, j + 1)) * Math.pow(2, i)) + " ");
                }
                System.out.println();
            }
        }
    }


    private static class Task10 {
        public static void main(String[] args) {
            Scanner numbers = new Scanner(System.in);
            System.out.println("Введите число №1");
            double number1 = numbers.nextDouble();
            System.out.println("Введите число №2");
            double number2 = numbers.nextDouble();
            System.out.println("Введите оператор");
            String operator = numbers.next();
            switch (operator) {
                case "+" -> System.out.println("Сумма чисел равняется " + (number1 + number2));
                case "-" -> System.out.println("Разность чисел равняется " + (number1 - number2));
                case "*" -> System.out.println("Произведение чисел равняется " + (number1 * number2));
                case "/" -> System.out.println("Частное чисел равняется " + (number1 / number2));
                default -> System.out.println("Введите корректный оператор");
            }

        }
    }

    private static class Task11 {
        public static void main(String[] args) {
            int biggest = Integer.MAX_VALUE;
            int problem = Math.addExact(biggest, 1);
            System.out.println(problem);

        }
    }

    private static class Task12 {
        public static void main(String[] args) {
            Scanner number = new Scanner(System.in);
            double first = 1.1d;
            double second = 0.9d;
            System.out.println(second - first);
            System.out.println(first - second);

        }
    }

    private static class Task13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int number = scanner.nextInt();
            int a = 1;
            while (number > 1) {
                a = a * number;
                number--;
            }
            System.out.println("Факториал числа равен " + a);
        }
    }

    private static class Task14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] chain = new int[n + 1];
            chain[0] = 0;
            chain[1] = 1;
            if (n == 1) {
                System.out.println(chain[1]);
            } else if (n == 0) {
                System.out.println(chain[0]);
            } else {
                for (int i = 2; i <= n; ++i) {
                    chain[i] = chain[i - 1] + chain[i - 2];

                }
                System.out.println(chain[n]);
            }
        }


    }


    private static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);


    }

    private static class Task15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int n = scanner.nextInt();
            System.out.println("Факториал числа равняется " + factorial(n));
        }

    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static class Task16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер числа последовательности Фибоначчи: ");
            int numberfib = scanner.nextInt();
            System.out.println(numberfib + " число последовательности Фибоначчи - " + fib(numberfib));
        }
    }

    private static class Task17 {    //Известны координаты на плоскости двух точек (x1, y1 и x2, y2). Составить программу вычисления расстояния между ними.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите координату x1 : ");
            int x1 = scanner.nextInt();
            System.out.println("Введите координату x2 : ");
            int x2 = scanner.nextInt();
            System.out.println("Введите координату y1 : ");
            int y1 = scanner.nextInt();
            System.out.println("Введите координату y2 : ");
            int y2 = scanner.nextInt();
            double L = Math.sqrt(((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));
            System.out.println("Расстояние между точками равно " + L);

        }
    }

    private static class Task18 { //Дано а. Не используя никаких функций и никаких операций, кроме умножения, получить а^8 за три операции; а^10 и а^16 за четыре операции.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            /*a = a*a;                //a^8 за три операции
            a = a*a;
            a = a*a;
            System.out.println(a);

             */
            int a1 = a * a;
            int a2 = a1 * a1;
            int a3 = a2 * a2;
            int a4 = a3 * a1;
            System.out.println(a4);

        }
    }

    private static class Task19 {//Заданы координаты трех вершин треугольника (х1, y1), (х2, у2), (х3, у3). Найти его периметр и площадь.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите координату x1 : ");
            int x1 = scanner.nextInt();
            System.out.println("Введите координату x2 : ");
            int x2 = scanner.nextInt();
            System.out.println("Введите координату x3 : ");
            int x3 = scanner.nextInt();
            System.out.println("Введите координату y1 : ");
            int y1 = scanner.nextInt();
            System.out.println("Введите координату y2 : ");
            int y2 = scanner.nextInt();
            System.out.println("Введите координату y3 : ");
            int y3 = scanner.nextInt();
            double a = Math.sqrt(((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));
            double b = Math.sqrt(((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2))));
            double c = Math.sqrt(((Math.pow(x1 - x3, 2)) + (Math.pow(y1 - y3, 2))));
            double P = a + b + c;
            double p = (a + b + c) / 2;
            double h = (2/c) * (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
            double S = (c * h)/2;
            System.out.println("Периметр треугольника равняется " + P);
            System.out.println("Площадь треугольника равняется " + S);
        }
    }

}



























