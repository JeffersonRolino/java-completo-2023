package chapter_10.lesson_86.application;

import chapter_10.lesson_86.entities.Product;

public class Main {
    public static void main(String[] args) {
        // Tipo primitivo salvo na Stack
        int p;
        p = 10;
//        System.out.println(p);

        //Objetos são instanciados no heap

        //Quando alocamos (new) qualquer tipo estruturado (classe ou array),
        //são atribuídos valores padrão aos seus elementos
        //números = 0, boolean = false, char = caractere código 0, objeto = null
        Product product = new Product();
        System.out.println(product);
    }
}
