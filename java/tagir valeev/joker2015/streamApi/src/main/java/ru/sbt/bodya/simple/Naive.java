package ru.sbt.bodya.simple;

import java.util.stream.IntStream;

public class Naive {

    public static void main(String[] args) {

        long startSimple = System.nanoTime();
        long resultSimple = sumTwice(10_000_000);
        long endSimple = System.nanoTime();
        System.out.printf("Simple: %d; time = %8.3fms%n", resultSimple, (endSimple - startSimple) / 1_000_000.0);

        long startSteam = System.nanoTime();
        long resultSteam = sumTwiceStream(10_000_000);
        long endStream = System.nanoTime();
        System.out.printf("Steam: %d; time = %8.3fms%n", resultSteam, (endStream-startSteam) / 1_000_000.0);

    }

    private static long sumTwice(int max) {

        long sum = 0;
        for (int i = 0; i <= max; i++) {

            sum += i * 2;

        }
        return sum;

    }

    private static long sumTwiceStream(int max) {

        return IntStream.rangeClosed(1, max).mapToLong(x -> x * 2).sum();

    }

}
