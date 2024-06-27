package chapter_19.lesson_249.application;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99713344");

        cookies.remove("email");
        cookies.put("phone", "88641234");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());


        System.out.println("\nALL COOKIES");
        for(String key : cookies.keySet()){
            System.out.println(cookies.get(key));
        }
    }
}
