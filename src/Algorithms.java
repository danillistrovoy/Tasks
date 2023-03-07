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

        public static void mergeSort(int[] array, int left, int right) {
            if (right <= left) return;

            int mid = (left + left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }

        public static void merge(int[] array, int left, int mid, int right) {
            int leftArray[] = new int[mid - left + 1];
            int rightArray[] = new int[right - mid];
            for (int i = 0; i < leftArray.length; i++) {
                leftArray[i] = array[left + i];
            }
            for (int i = 0; i < rightArray.length; i++) {
                rightArray[i] = array[mid + i + 1];
            }
         /*   int leftIndex = 0;
            int rightIndex = 0;
            for (int i = left; i < right + 1; i++) {
                if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                    if (leftArray[leftIndex] < rightArray[rightIndex]) {
                        array[i] = leftArray[leftIndex];
                        leftIndex++;
                    } else {
                        array[i] = rightArray[rightIndex];
                        rightIndex++;
                    }
                } else if (leftIndex < leftArray.length) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else if (rightIndex < rightArray.length) {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
        }


    }*/


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
