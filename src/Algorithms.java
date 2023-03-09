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
            mergeSort(array);
            for (int i = 0; i < array.length ; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public static void mergeSort(int[] array) {
            int l = array.length;
            if (l == 1) {
                return;
            }
            int mid = l / 2;
            int[] left = new int[mid];
            int[] right = new int[l - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            for (int i = 0; i < l - mid; i++) {
                right[i] = array[i + mid];
            }
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }

        public static void merge(int[] array, int[] left, int[] right) {
            int l = left.length;
            int r = right.length;
            int i = 0;
            int j = 0;
            int index = 0;
            while (i < l && j < r) {
                if (left[i] < right[j]) {
                    array[index] = left[i];
                    i++;
                    index++;
                } else {
                    array[index] = right[j];
                    j++;
                    index++;
                }
            }
            for (int k = i; k < l ; k++) {
                array[index++] = left[k];
            }
            for (int kk = j; kk < r ; kk++) {
                array[index++] = right[kk];
            }
        }
    }


    private static class BinaryNumberSearch {
        public static void main(String[] args) {
            int[] array = new int[]{1, 3, 2, 4, 5, 10, 6, 7, 9, 8};
            Arrays.sort(array);
            System.out.println(BinarySearch(array, 6));
        }

        static int BinarySearch(int[] array, int n) {
            int step = 0;
            int low = 0;
            int high = array.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (n == array[mid]) {
                    System.out.println("Метод выполнен за " + step + " шагов");
                }
                if (n < array[mid]) {
                    high = mid - 1;
                    step++;
                } else if (n > array[mid]) {
                    low = mid + 1;
                    step++;
                } else {
                    step++;
                    return mid;
                }

            }
            return -1;
        }
    }


}
