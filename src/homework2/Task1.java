package homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// (через FileWriter)
public class Task1 {
    public static void getSortedNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество элементов массива:  ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введи элемент массива: ");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        boolean isSorted = false;
        int temp;
        try {
            FileWriter in = new FileWriter("bubble.txt");
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                    in.append(Arrays.toString(array));
                    System.out.println("Recorded");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(array));
    }

}



