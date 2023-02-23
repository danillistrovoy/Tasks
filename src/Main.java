import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }


    private static class Task1 {             //Ввести 2 переменных(int) и поменять их местами.
        public static void main(String[] args) {

        }

        private static class Task2 {    //Ввести 2 переменных(int) и поменять их местами без использования третьей переменной

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
            int [][] matrice = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < matrice.length; j++) {
                    System.out.print(matrice[i][j] + " ");
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

}









