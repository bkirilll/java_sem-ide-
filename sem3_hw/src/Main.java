import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = createList(10, 0, 50); // список для первого задания
//        System.out.println(ex1(list));
//        List<Integer> list2 = createList(10, 0, 50); // список для второго задания
//        ex2(list2);
        ex3();
//        ex4();

    }


    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println(list);
        return list;
    }

    static List<Integer> ex1(List<Integer> input) {
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) % 2 == 0) {
                input.remove(i);
                i--;
            }
        }
        return input;
    }

    static void ex2(List<Integer> input) {
        int max = Collections.max(input);
        int min = Collections.min(input);
        double sum = 0;
        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);
        }
        double mean = sum / input.size();
        System.out.printf("max = %d min = %d mean = %.2f", max, min, mean);
    }

    static List<String> ex3() {
        List<String> listOfPlanets = new ArrayList<>();
        listOfPlanets.add("Меркурий");
        listOfPlanets.add("Венера");
        listOfPlanets.add("Меркурий");
        listOfPlanets.add("Земля");
        listOfPlanets.add("Уран");
        listOfPlanets.add("Меркурий");
        listOfPlanets.add("Венера");
        listOfPlanets.add("Сатурн");
        listOfPlanets.add("Марс");
        listOfPlanets.add("Сатурн");
        listOfPlanets.add("Юпитер");
        listOfPlanets.add("Земля");
        listOfPlanets.add("Уран");
        listOfPlanets.add("Сатурн");
        listOfPlanets.add("Марс");
        listOfPlanets.add("Земля");
        listOfPlanets.add("Марс");
        listOfPlanets.add("Нептун");

        System.out.println(listOfPlanets);
        int sum1 = 0; int sum2 = 0; int sum3 = 0; int sum4 = 0;
        int sum5 = 0; int sum6 = 0; int sum7 = 0; int sum8 = 0;
        for (int i = 0; i < listOfPlanets.size(); i++) {
            if (listOfPlanets.get(i) == "Меркурий") {
                sum1 += 1;
            }
            if (listOfPlanets.get(i) == "Венера") {
                sum2 += 1;
            }
            if (listOfPlanets.get(i) == "Земля") {
                sum3 += 1;
            }
            if (listOfPlanets.get(i) == "Марс") {
                sum4 += 1;
            }
            if (listOfPlanets.get(i) == "Сатурн") {
                sum5 += 1;
            }
            if (listOfPlanets.get(i) == "Юпитер") {
                sum6 += 1;
            }
            if (listOfPlanets.get(i) == "Уран") {
                sum7 += 1;
            }
            if (listOfPlanets.get(i) == "Нептун") {
                sum8 += 1;
            }
        }
        System.out.printf("Меркурий = %d\n", sum1);
        System.out.printf("Венера = %d\n", sum2);
        System.out.printf("Земля = %d\n", sum3);
        System.out.printf("Марс = %d\n", sum4);
        System.out.printf("Сатурн = %d\n", sum5);
        System.out.printf("Юпитер = %d\n", sum6);
        System.out.printf("Уран = %d\n", sum7);
        System.out.printf("Нептун = %d\n", sum8);
        return listOfPlanets;
    }

    static void ex4() {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 5, 11, 9};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}