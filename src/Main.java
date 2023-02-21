import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }


    private static class Task1 {
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

        private static class Task2 {

        }
    }

    private static class Task3 {
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
}