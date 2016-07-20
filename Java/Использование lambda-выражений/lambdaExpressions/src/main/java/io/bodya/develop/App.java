package io.bodya.develop;

import io.bodya.develop.Interfaces.IWorker;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App 
{

    // Каждое lambda-выражение может быть неявно привязано к какому-нибудь функциональному интерфейсу.
    private static void execute(IWorker worker) {
        worker.doSomeWork();
    }

    public static void main( String[] args ) {
        execute( () -> System.out.println("Worker вызван через Lambda") );

        IWorker worker = () -> System.out.println("Worker вызван через Lambda");
        worker.doSomeWork();


        App app = new App();
        app.testingSomeshit();



        // вызов метода doSomeWork через анонимный класс
        // (классический способ)
        execute(new IWorker() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker вызван через анонимный класс");
            }
        });
    }


    // Использоание lambda в качестве теста для отсеивания чисел в листе/массиве и т.п.
    private int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }

    private void testingSomeshit() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(sumAll(numbers, n -> true));
        System.out.println(sumAll(numbers, n -> n % 2 == 0));
        System.out.println(sumAll(numbers, n -> n > 3));

    }



}
