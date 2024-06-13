package chapter_19.lesson_242.problem_02.application;

import java.util.ArrayList;
import java.util.List;

public class Covariance {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        //CANNOT ADD
//        list.add(20); // erro de compilacao
    }
}
