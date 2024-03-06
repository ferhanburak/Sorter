package part2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] ascendingArray = generateAscendingArray(10000);  
        int[] descendingArray = generateDescendingArray(10000);  
        int[] randomArray = generateRandomArray(10000); 
        testSortingAlgorithm("sort1", ascendingArray);
        testSortingAlgorithm("sort2", ascendingArray);
        testSortingAlgorithm("sort3", ascendingArray);
        testSortingAlgorithm("sort4", ascendingArray);
        testSortingAlgorithm("sort5", ascendingArray);

        testSortingAlgorithm("sort1", descendingArray);
        testSortingAlgorithm("sort2", descendingArray);
        testSortingAlgorithm("sort3", descendingArray);
        testSortingAlgorithm("sort4", descendingArray);
        testSortingAlgorithm("sort5", descendingArray);

        testSortingAlgorithm("sort1", randomArray);
        testSortingAlgorithm("sort2", randomArray);
        testSortingAlgorithm("sort3", randomArray);
        testSortingAlgorithm("sort4", randomArray);
        testSortingAlgorithm("sort5", randomArray);
       
    }

    private static void testSortingAlgorithm(String methodName, int[] array) {
        long startTime = System.nanoTime();
        switch (methodName) {
            case "sort1":
                sorter.sort1(array);
                break;
            case "sort2":
                sorter.sort2(array);
                break;
            case "sort3":
                sorter.sort3(array);
                break;
            case "sort4":
                sorter.sort4(array);
                break;
            case "sort5":
                sorter.sort5(array);
                break;
            default:
                System.out.println("Invalid sorting method name.");
                return;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println(methodName + ": " + duration + " milliseconds");
    }

    private static int[] generateAscendingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int[] generateDescendingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }
}