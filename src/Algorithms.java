import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Algorithms {
    private static class Task1 {
        public static void main(String[] args) {
            boolean sorted = false;

            int[] array = new int[]{51, 20, 43, 24, 93, 37, 29, 45, 63, 78};
            while (!sorted) {
                sorted = true;

                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        sorted = false;
                    }
                }

            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
        }
    }

    private static class Task3 {
        public static void main(String[] args) {
            int[] array = new int[]{16, 43, 20, 24, 93, 37, 29, 45, 63, 78};
            for (int i = 0; i < array.length; i++) {
                int a = array[i];
                int j = i;
                int b;
                while (j > 0 && array[j - 1] >= a) {
                    b = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = b;
                    j--;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static class Task4 {
        public static void main(String[] args) {
            int[] array = new int[]{16, 43, 20, 24, 93, 37, 29, 45, 63, 78};

        }
    }

    private static class Task5 {
        public static void main(String[] args) {

        }
    }

    private static class Task6 {
        public static void main(String[] args) {

        }
    }

    private static class Task7 {
        public static void main(String[] args) {

        }
    }

    private static class Task8 {
        public static void main(String[] args) {

        }
    }

}
