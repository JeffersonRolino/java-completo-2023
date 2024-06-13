package chapter_19.lesson_242.problem_02.application;

import java.util.ArrayList;
import java.util.List;

public class Contravariance {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);
        // CANNOT GET
//        Number x = myNums.get(0); // erro de compilacao
    }
}
