import java.util.Arrays;

public class Algorithms {
    private static class Alg1 {
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

    private static class Alg3 {
        public static void main(String[] args) {
            int[] array = new int[] {16, 43, 20, 24, 93, 37, 29, 45, 63, 78};
            for (int i = 0; i < array.length; i++) {
                int a = array[i];
                int j = i;
                while (j > 0 && array[j - 1] >= a) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = array[i];
            }
            System.out.println(Arrays.toString(array));
        }
    }

}
