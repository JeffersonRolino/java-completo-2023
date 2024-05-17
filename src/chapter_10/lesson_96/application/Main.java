package chapter_10.lesson_96.application;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {"Mary", "Bob", "Alex", "John"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("-------------------------------------");
        for(String name : names){
            System.out.println(name);
        }
    }
}
