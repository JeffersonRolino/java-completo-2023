package chapter_20.lesson_254.application;

import java.util.Arrays;

/**
 * Transparência referencial
 * Uma função possui transparência referencial se seu resultado for sempre o mesmo
 * para os mesmos dados de entrada. Benefícios: simplicidade e previsibilidade.
 * O exemplo abaixo não possui transparência referencial.
 */
public class FunctionalTransparency {
    public static int globalValue = 3;

    public static void main(String[] args) {
        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    // Esta função não possui Transparencia Referencial
    // pois depende de uma váriavel externa (referencia externa)
    // que influência em sua saída (output).
    public static void changeOddValues(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }
}
