package chapter_19.lesson_244.application;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Meia");
        set.add("Copo");
        set.add("Armário");
        set.add("Abajur");
        set.add("Guarda Roupas");
        set.add("Panela de Pressão");

        // Removendo 1 item
        set.remove("Tablet");

        // Removendo com predicado -> Remove todos os produtos com nome
        // maior do que cinco letras...
        set.removeIf(x -> x.length() > 5);

        System.out.println("O produto Notebook existe no conjunto: " + set.contains("Notebook"));

        System.out.println("\nLista de Produtos");
        for (String p : set) {
            System.out.println(p);
        }
    }
}
