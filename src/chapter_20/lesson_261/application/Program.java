package chapter_20.lesson_261.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 18, 5, 7, 42, 13, 21, 14, 10, 4);

        Stream<Integer> stream1 = numbers.stream().map(n -> n * 10);
        System.out.println(Arrays.toString(stream1.toArray()));

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);

        List<Integer> newList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .toList();

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
