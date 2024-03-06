package ProgrammingAssignment2;

import java.util.Comparator;
import java.util.*;


public class QuickSort {
    public static <T extends Comparable<T>> void quickSortDescending(T[] array) {
        quickSortDescending(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quickSortDescending(T[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partitionDescending(array, low, high);
            quickSortDescending(array, low, partitionIndex - 1);
            quickSortDescending(array, partitionIndex + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partitionDescending(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) >= 0) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static <T> void quickSortDescending(T[] array, Comparator<T> comparator) {
        quickSortDescending(array, 0, array.length - 1, comparator);
    }

    private static <T> void quickSortDescending(T[] array, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int partitionIndex = partitionDescending(array, low, high, comparator);
            quickSortDescending(array, low, partitionIndex - 1, comparator);
            quickSortDescending(array, partitionIndex + 1, high, comparator);
        }
    }

    private static <T> int partitionDescending(T[] array, int low, int high, Comparator<T> comparator) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) >= 0) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
