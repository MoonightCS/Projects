package io.bodya.develop;

import java.util.Arrays;
import java.util.List;

public class ArrayAndList {

    public static void main(String[] args) {


        // Старый способ:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list) {
            System.out.printf("%d ", n);
        }
        System.out.println();


        // Новый способ:
        list.forEach(n -> System.out.printf("%d ", n));

        // Новый способ с использованием оператора двойного двоеточия ::
        list.forEach(System.out::println);

    }

}
