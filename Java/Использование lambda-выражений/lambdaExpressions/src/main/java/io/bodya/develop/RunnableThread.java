package io.bodya.develop;

import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class RunnableThread {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("hello world");

        new Thread(
                () -> System.out.println("Hello from thread")
        ).start();

        new Thread(r).start();
    }

}
