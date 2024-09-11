package chapter_20.lesson_260.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 10, 7, 42);

        Stream<Integer> stream1 = numbers.stream().map(n -> n * 10);
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<String> stream2 = Stream.of("Tyrion", "Daenerys", "Varys", "Eddard");
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2).limit(10);
        System.out.println(Arrays.toString(stream3.toArray()));

        Stream<Integer> fibonacci = Stream.iterate(new Integer[]{0, 1}, n -> new Integer[]{n[1], n[0] + n[1]}).map(p -> p[0]).limit(10);
        System.out.println(Arrays.toString(fibonacci.toArray()));
    }
}
