package ProgrammingAssignment2;

import java.util.Comparator;
import java.util.*;


public class MergeSort {
    public static <T extends Comparable<T>> void mergeSortDescending(T[] array) {
        mergeSortDescending(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void mergeSortDescending(T[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortDescending(array, low, mid);
            mergeSortDescending(array, mid + 1, high);
            mergeDescending(array, low, mid, high);
        }
    }

    private static <T extends Comparable<T>> void mergeDescending(T[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        T[] leftArray = (T[]) new Comparable[n1];
        T[] rightArray = (T[]) new Comparable[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) >= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static <T> void mergeSortDescending(T[] array, Comparator<T> comparator) {
        mergeSortDescending(array, 0, array.length - 1, comparator);
    }

    public static <T> void mergeSortDescending(T[] array, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortDescending(array, low, mid, comparator);
            mergeSortDescending(array, mid + 1, high, comparator);
            mergeDescending(array, low, mid, high, comparator);
        }
    }

    private static <T> void mergeDescending(T[] array, int low, int mid, int high, Comparator<T> comparator) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        T[] leftArray = (T[]) new Object[n1];
        T[] rightArray = (T[]) new Object[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if (comparator.compare(leftArray[i], rightArray[j]) >= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
